package com.example.showtimes_data.network

import com.example.showtimes_data.model.VenueResponse
import retrofit2.http.GET

interface VenueApiService {
    //https://demo2782755.mockable.io/movie_showtimes

    @GET(MOVIE_SHOWTIMES)
    suspend fun getVenues(): VenueResponse

    companion object {
        const val MOVIE_SHOWTIMES = "movie_showtimes"
    }
}