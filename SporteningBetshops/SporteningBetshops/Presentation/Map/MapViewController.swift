import MapKit
import RxSwift
import UIKit

class MapViewController: UIViewController, CLLocationManagerDelegate {

    // MARK: - Outlets
    @IBOutlet weak var mapView: MKMapView!

    // MARK: - Properties
    private var viewModel: MapViewModel!
    private let disposeBag = DisposeBag()

    // MARK: - Setup
    func configure(viewModel: MapViewModel) {
        self.viewModel = viewModel
    }

    // MARK: - Lifecycle
    override func viewDidLoad() {
        super.viewDidLoad()
        setupNavigationBar()
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        bindViewModel()

        viewModel.input.viewWillAppear.onNext(())
    }

    // MARK: - UI
    private func setupNavigationBar() {
        title = "Bet shops"
    }

    private func bindViewModel() {
        viewModel.output.userLocation
            .asSignal()
            .emit(onNext: centerToLocation)
            .disposed(by: disposeBag)

        viewModel.output.betshops
            .asSignal()
            .emit(onNext: showBetshops)
            .disposed(by: disposeBag)

        viewModel.output.betshopDetails
            .asSignal()
            .emit(onNext: showDetails)
            .disposed(by: disposeBag)
    }

    private func centerToLocation(coordinateRegion: MKCoordinateRegion) {
        mapView.setRegion(coordinateRegion, animated: true)
    }

    private func showBetshops(_ betshops: [BetshopAnnotation]) {
        mapView.removeAnnotations(mapView.annotations)
        mapView.addAnnotations(betshops)
    }

    // MARK: - Navigation
    func showDetails(betshop: BetshopResponse) {
        guard let betshopDetailsViewController = R.storyboard.main.betshopDetailsViewControllerId() else { return }

        let betshopDetailsViewModel = BetshopDetailsViewModel(betshop: betshop)
        betshopDetailsViewController.configure(viewModel: betshopDetailsViewModel)

        self.addChild(betshopDetailsViewController)
        self.view.addSubview(betshopDetailsViewController.view)
        betshopDetailsViewController.didMove(toParent: self)

        // 3- Adjust bottomSheet frame and initial position.
        let height = 200.0
        let width = view.frame.width
        betshopDetailsViewController.view.frame = CGRect(x: 0.0,
                                                         y: self.view.frame.maxY,
                                                         width: width,
                                                         height: height)
        #warning("Setup shadow and top radius and content height.")
    }

    private func removeTopChildViewController(){
        if self.children.count > 0{
            let viewControllers:[UIViewController] = self.children
               viewControllers.last?.willMove(toParent: nil)
               viewControllers.last?.removeFromParent()
               viewControllers.last?.view.removeFromSuperview()
        }
    }

}

extension MapViewController: MKMapViewDelegate {

    func mapView(_ mapView: MKMapView, viewFor annotation: MKAnnotation) -> MKAnnotationView? {
        guard !(annotation is MKUserLocation),
              let annotation = annotation as? BetshopAnnotation else { return nil }

        let identifier = "Annotation"
        var annotationView = mapView.dequeueReusableAnnotationView(withIdentifier: identifier) as? BetshopAnnotationView
        if annotationView == nil {
            annotationView = BetshopAnnotationView(annotation: annotation, reuseIdentifier: identifier)
        } else {
            annotationView?.update(with: annotation)
        }

        return annotationView
    }

    func mapView(_ mapView: MKMapView, didSelect view: MKAnnotationView) {
        guard let annotationView = view as? BetshopAnnotationView,
              let annotation = annotationView.annotation as? BetshopAnnotation else {
            return
        }
        annotationView.itemSelected = true
        viewModel.input.action
            .onNext(.tappedBetshop(id: annotation.identifier))
    }

    func mapView(_ mapView: MKMapView, didDeselect view: MKAnnotationView) {
        guard let annotationView = view as? BetshopAnnotationView else {
            return
        }
        annotationView.itemSelected = false
        removeTopChildViewController()
    }

    func mapView(_ mapView: MKMapView, regionDidChangeAnimated animated: Bool){
        viewModel.input.action
            .onNext(.loadBetshops(northEast: mapView.region.northEast,
                                  southWest: mapView.region.southWest))
    }

}

