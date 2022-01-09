import UIKit
import MapKit

class BetshopAnnotationView: MKAnnotationView {

    var itemSelected = false {
        didSet {
            if itemSelected {
                self.image = R.image.betshopSelected()
            } else {
                self.image = R.image.betshopUnselected()
            }
        }
    }

    override init(annotation: MKAnnotation?, reuseIdentifier: String?) {
        super.init(annotation: annotation, reuseIdentifier: reuseIdentifier)
        image = R.image.betshopUnselected()
    }

    required init?(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }

    public func update(with annotation: BetshopAnnotation) {
        self.annotation = annotation
        image = R.image.betshopUnselected()
    }

}
