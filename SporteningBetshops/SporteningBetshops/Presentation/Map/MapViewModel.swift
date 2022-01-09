import Foundation
import RxSwift
import RxCocoa
import MapKit

class MapViewModel {

    private let defaultLocation = CLLocation(latitude: 48.137154,
                                             longitude: 11.576124)
    private let defaultRegionRadius: CLLocationDistance = 1000

    var input = Input()
    var output = Output()

    enum Action {
        case loadBetshops(northEast: CLLocationCoordinate2D,
                          southWest: CLLocationCoordinate2D)
        case tappedBetshop(id: UInt64)
    }

    struct Input {
        let action = PublishSubject<Action>()
        let viewWillAppear = PublishSubject<Void>()
    }

    struct Output {
        let userLocation = PublishRelay<MKCoordinateRegion>()
        let betshops = PublishRelay<[BetshopAnnotation]>()

        let betshopDetails = PublishRelay<BetshopResponse>()
    }

    private var betshops: [BetshopResponse] = []

    private let betshopService: BetshopServiceProtocol
    private let locationManager: LocationManager
    private let disposeBag = DisposeBag()

    init(betshopService: BetshopServiceProtocol) {
        self.betshopService = betshopService
        locationManager = LocationManager()

        listenForInputs()
    }

    // MARK: - Bindings
    private func setupOutputs() {
        locationManager.currentLocation.first()
            .subscribe(with: self) { owner, location in
                guard let location = location else { return }
                owner.setupLocation(location)
        }.disposed(by: disposeBag)
    }

    private func listenForInputs() {
        input.viewWillAppear
            .subscribe(with: self,
                       onNext: { owner, _ in
                owner.setupOutputs()
                owner.setupLocation(owner.defaultLocation.coordinate)
            }).disposed(by: disposeBag)

        input.action
            .subscribe(with: self,
                       onNext: { owner, action in
            switch action {
            case .loadBetshops(let northEast,
                               let southWest):
                owner.handleLoadBetshops(northEast: northEast,
                                         southWest: southWest)
            case .tappedBetshop(let id):
                owner.handleBetshopClick(id)
            }
        }).disposed(by: disposeBag)
    }

    // MARK: - Data
    private func setupLocation(_ location: CLLocationCoordinate2D) {
        let coordinateRegion = MKCoordinateRegion(center: location,
                                                  latitudinalMeters: defaultRegionRadius,
                                                  longitudinalMeters: defaultRegionRadius)
        output.userLocation.accept(coordinateRegion)
    }

    private func handleLoadBetshops(northEast: CLLocationCoordinate2D,
                                    southWest: CLLocationCoordinate2D) {
        let request = BetshopsRequest(lat1: northEast.latitude,
                                      lat2: southWest.latitude,
                                      lon1: northEast.longitude,
                                      lon2: southWest.longitude)
        betshopService.fetch(request)
//            .throttle(.milliseconds(250),
//                      latest: false,
//                      scheduler: MainScheduler.asyncInstance)
            .subscribe(with: self, onNext: { owner, response in
                owner.betshops = response.betshops
                let betshopAnnotations = response.betshops.map { betshop in
                    BetshopAnnotation(coordinate: CLLocationCoordinate2D(latitude: betshop.location.latitude,
                                                                         longitude: betshop.location.longitude),
                                      identifier: betshop.id)
                }
                owner.output.betshops.accept(betshopAnnotations)
            }, onError: { _, error in
                print("Something went wrong \(error.localizedDescription)")
                #warning("Not specified what to do.")
            }).disposed(by: disposeBag)
    }

    private func handleBetshopClick(_ id: UInt64) {
        guard let betshop = betshops.first(where: {
            $0.id == id
        }) else { return }
        output.betshopDetails.accept(betshop)
    }

}
