import CoreLocation
import RxSwift

class LocationManager: NSObject {

    var currentLocation = PublishSubject<CLLocationCoordinate2D>()
    let locationManager: CLLocationManager

    override init() {
        locationManager = CLLocationManager()
        locationManager.requestWhenInUseAuthorization()

        super.init()
        if CLLocationManager.locationServicesEnabled() {
            locationManager.delegate = self
            locationManager.desiredAccuracy = kCLLocationAccuracyNearestTenMeters
            locationManager.startUpdatingLocation()
        }
    }

}

extension LocationManager: CLLocationManagerDelegate {

    func locationManager(_ manager: CLLocationManager, didUpdateLocations locations: [CLLocation]) {
        guard let locValue: CLLocationCoordinate2D = manager.location?.coordinate else { return }
        currentLocation.onNext(locValue)
    }

}
