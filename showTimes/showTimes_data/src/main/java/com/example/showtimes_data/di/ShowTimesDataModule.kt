package com.example.showtimes_data.di

import com.example.showtimes_data.network.VenueApiService
import com.example.showtimes_data.repository.ShowTimesRepositoryImpl
import com.example.showtimes_domain.repository.ShowTimesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ShowTimesDataModule {

    @Provides
    fun providesVenueApiService(retrofit: Retrofit): VenueApiService {
        return retrofit.create(VenueApiService::class.java)
    }

    @Provides

    fun providesShowTimesRepository(venueApiService: VenueApiService): ShowTimesRepository {
        return ShowTimesRepositoryImpl(venueApiService)
    }
}