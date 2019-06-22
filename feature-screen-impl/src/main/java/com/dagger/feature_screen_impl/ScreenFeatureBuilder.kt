package com.dagger.feature_screen_impl

import com.dagger.feature_screen_api.ScreenFeatureApi
import com.dagger.feature_screen_impl.di.DaggerScreenFeatureComponent
import com.dagger.feature_screen_impl.di.ScreenFeatureComponent
import com.dagger.feature_screen_impl.di.ScreenFeatureDependencies

object ScreenFeatureBuilder {
    private var component: ScreenFeatureComponent? = null

    fun buildComponent(dependencies: ScreenFeatureDependencies) {
        component = DaggerScreenFeatureComponent.builder()
            .screenFeatureDependencies(dependencies)
            .build()
    }

    internal fun getComponent(): ScreenFeatureComponent = component!!

    fun hasComponent(): Boolean {
        return component != null
    }

    fun releaseComponent() {
        component = null
    }

    fun getApi(): ScreenFeatureApi = component!!.api()
}