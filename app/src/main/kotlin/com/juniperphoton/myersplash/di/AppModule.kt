package com.juniperphoton.myersplash.di

import com.juniperphoton.myersplash.api.CloudService
import com.juniperphoton.myersplash.api.IOService
import com.juniperphoton.myersplash.api.PhotoService
import com.juniperphoton.myersplash.di.hilt.AnalysisModule
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module(includes = [AnalysisModule::class])
@DisableInstallInCheck
class AppModule {
    @Provides
    fun provideImageService(): PhotoService {
        return CloudService.createService()
    }

    @Singleton
    @Provides
    fun provideIOService(): IOService {
        return CloudService.createService()
    }
}