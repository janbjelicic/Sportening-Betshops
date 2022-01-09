import Foundation

struct BetshopsRequest: Encodable {
    
    let lat1: Double
    let lat2: Double
    let lon1: Double
    let lon2: Double
    
}

extension BetshopsRequest: NetworkRequest {
    
    var path: String {
        "betshops"
    }
    
    var method: HttpVerb {
        .get
    }
    
    var parameters: [String: Any]? {
        ["boundingBox": "\(lat1),\(lon1),\(lat2),\(lon2)"]
    }
    
}
