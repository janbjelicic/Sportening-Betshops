import UIKit

class AppCoordinator: Coordinator {

    private let window: UIWindow
    var childrenCoordinators = [Coordinator]()
    var navigationController: UINavigationController

    init(window: UIWindow, navigationController: UINavigationController) {
        self.window = window
        self.navigationController = navigationController
    }

    func start() {
        guard let mapViewController = R.storyboard.main.mapViewControllerId() else { return }

        // I would usually setup a dependency injection resolving mechanism with an app context.
        let networkManager = NetworkManager()
        let betshopService = BetshopService(networkManager: networkManager)
        let mapViewModel = MapViewModel(betshopService: betshopService)
        mapViewController.configure(viewModel: mapViewModel)
        navigationController.pushViewController(mapViewController, animated: false)
        window.rootViewController = navigationController
        window.makeKeyAndVisible()
    }

}
