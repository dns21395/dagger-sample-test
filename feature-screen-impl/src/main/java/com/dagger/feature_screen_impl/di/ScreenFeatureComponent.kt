package com.dagger.feature_screen_impl.di

import com.dagger.core_utils.PerFeature
import com.dagger.feature_screen_api.ScreenFeatureApi
import com.dagger.feature_screen_impl.di.screen.ScreenComponent
import dagger.Component

@Component(
    dependencies = [ScreenFeatureDependencies::class],
    modules = [ScreenFeatureModule::class]
)
@PerFeature
interface ScreenFeatureComponent {
    fun api(): ScreenFeatureApi
    fun screenComponent(): ScreenComponent
}