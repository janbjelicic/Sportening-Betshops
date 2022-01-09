struct BetshopResponse: Decodable {

    let id: UInt64
    let name: String
    let location: LocationResponse
    let address: String
    let county: String
    let cityId: UInt64
    let city: String

    enum CodingKeys: String, CodingKey {
        case id
        case name
        case location
        case address
        case county
        case cityId = "city_id"
        case city
    }

}
