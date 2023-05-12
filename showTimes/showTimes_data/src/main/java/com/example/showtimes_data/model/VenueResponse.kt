package com.example.showtimes_data.model

data class VenueResponse(
    val venues: List<VenueDTO>
)

data class VenueDTO(
    val name: String,
    val showDate: String,
    val showtimes: List<ShowtimeDTO>
)

data class ShowtimeDTO(
    val showDateCode: Long,
    val showTime: String
)