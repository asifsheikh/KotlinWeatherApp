package com.example.weathermentor.di

import com.example.weathermentor.repo.WeatherRepo
import com.example.weathermentor.repo.WeatherRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepo(weatherRepoImpl: WeatherRepoImpl): WeatherRepo
}