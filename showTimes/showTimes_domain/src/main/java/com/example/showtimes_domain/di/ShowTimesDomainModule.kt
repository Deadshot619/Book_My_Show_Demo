package com.example.showtimes_domain.di

import com.example.showtimes_domain.repository.ShowTimesRepository
import com.example.showtimes_domain.usecase.GetShowTimesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ShowTimesDomainModule {

    @Provides
    fun provideGetShowTimesUseCase(showTimesRepository: ShowTimesRepository): GetShowTimesUseCase {
        return GetShowTimesUseCase(showTimesRepository)
    }
}