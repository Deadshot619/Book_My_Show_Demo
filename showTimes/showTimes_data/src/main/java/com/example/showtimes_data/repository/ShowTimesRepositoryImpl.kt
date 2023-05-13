package com.example.showtimes_data.repository

import com.example.showtimes_data.mapper.toDomainVenue
import com.example.showtimes_data.network.VenueApiService
import com.example.showtimes_domain.model.Venue
import com.example.showtimes_domain.repository.ShowTimesRepository

class ShowTimesRepositoryImpl(
    private val venueApiService: VenueApiService
): ShowTimesRepository {
    override suspend fun getVenues(): List<Venue> {
        return venueApiService.getVenues().venues.map { it.toDomainVenue() }
    }
}