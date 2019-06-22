package com.dagger.feature_screen_impl.di

import com.dagger.core_utils.PerFeature
import com.dagger.feature_screen_api.ScreenFeatureApi
import com.dagger.feature_screen_impl.ScreenFeatureApiImpl
import dagger.Module
import dagger.Provides

@Module
class ScreenFeatureModule {
    @PerFeature
    @Provides
    fun provideScreenFeatureApi(): ScreenFeatureApi = ScreenFeatureApiImpl()
}