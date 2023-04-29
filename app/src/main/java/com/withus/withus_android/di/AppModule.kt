package com.withus.withus_android.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
//    @Provides
//    @Singleton
//    fun provideSessionService(): SessionService {
//        @OptIn(ExperimentalSerializationApi::class)
//        return Retrofit.Builder()
//            .baseUrl(URL_BASE)
//            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
//            .build()
//            .create()
//    }
}
