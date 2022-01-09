import Foundation
import RxSwift

protocol BetshopServiceProtocol {
    
    func fetch(_ request: BetshopsRequest) -> Observable<BetshopsResponse>
    
}

class BetshopService: BetshopServiceProtocol {
    
    let networkManager: NetworkManagerProtocol
    
    init(networkManager: NetworkManagerProtocol) {
        self.networkManager = networkManager
    }
    
    func fetch(_ request: BetshopsRequest) -> Observable<BetshopsResponse> {
        return networkManager.request(request: request)
    }
    
}
