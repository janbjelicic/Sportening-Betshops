import Foundation
import MapKit
import RxSwift
import RxCocoa

class BetshopDetailsViewModel {

    var input = Input()
    var output = Output()

    enum Action {
        case tappedRoute
    }

    struct Input {
        let action = PublishSubject<Action>()
        let viewWillAppear = PublishSubject<Void>()
    }

    struct Output {
        let name = BehaviorRelay<String?>(value: nil)
        let address = BehaviorRelay<String?>(value: nil)
        let cityCounty = BehaviorRelay<String?>(value: nil)
        let workingHours = BehaviorRelay<String?>(value: nil)
    }

    private let betshop: BetshopResponse
    private let disposeBag = DisposeBag()

    init(betshop: BetshopResponse) {
        self.betshop = betshop

        listenForInputs()
    }

    // MARK: - Bindings
    private func listenForInputs() {
        input.viewWillAppear
            .subscribe(with: self,
                       onNext: { owner, _ in
                owner.setupBetshopData()
            }).disposed(by: disposeBag)

        input.action
            .subscribe(with: self,
                       onNext: { owner, action in
            switch action {
            case .tappedRoute:
                owner.handleRoute()
            }
        }).disposed(by: disposeBag)
    }

    private func setupBetshopData() {
        output.name.accept(betshop.name)
        output.address.accept(betshop.address)
        output.cityCounty.accept("\(betshop.city) - \(betshop.county)")

        let hour = Calendar.current.component(.hour, from: Date())
        if hour >= 8 && hour < 16 {
            output.workingHours.accept("Open now until 16:00")
        } else {
            output.workingHours.accept("Opens tomorrow at 08:00")
        }
    }

    private func handleRoute() {
        let coordinate = CLLocationCoordinate2DMake(betshop.location.latitude,
                                                    betshop.location.longitude)
        let mapItem = MKMapItem(placemark: MKPlacemark(coordinate: coordinate,
                                                       addressDictionary: nil))
        mapItem.name = betshop.name
        mapItem.openInMaps(launchOptions: [MKLaunchOptionsDirectionsModeKey : MKLaunchOptionsDirectionsModeDriving])
    }

}
