import Foundation
import MapKit

class BetshopAnnotation: NSObject, MKAnnotation {

    let coordinate: CLLocationCoordinate2D
    let identifier: UInt64

    init(coordinate: CLLocationCoordinate2D,
         identifier: UInt64) {
        self.coordinate = coordinate
        self.identifier = identifier
    }
    
}
