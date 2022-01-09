import Foundation

struct BetshopsResponse: Decodable {
    
    let count: Int
    let betshops: [BetshopResponse]
    
}
