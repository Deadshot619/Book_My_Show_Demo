package com.example.showtimes_data.mapper

import com.example.showtimes_data.model.ShowtimeDTO
import com.example.showtimes_data.model.VenueDTO
import com.example.showtimes_domain.model.ShowTime
import com.example.showtimes_domain.model.Venue

fun VenueDTO.toDomainVenue() = Venue(
    name = this.name,
    showDate = this.showDate,
    showTimes = this.showtimes.map {
        it.toDomainShowTime()
    }
)

fun ShowtimeDTO.toDomainShowTime() = ShowTime(
    showDateCode = this.showDateCode,
    showTime = this.showTime
)