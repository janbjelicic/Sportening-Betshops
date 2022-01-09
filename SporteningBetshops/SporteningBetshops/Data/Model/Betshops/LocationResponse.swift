struct LocationResponse: Decodable {

    let longitude: Double
    let latitude: Double

    enum CodingKeys: String, CodingKey {
        case longitude = "lng"
        case latitude = "lat"
    }
    
}
