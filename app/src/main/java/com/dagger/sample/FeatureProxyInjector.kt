package com.dagger.sample

import android.content.Context
import com.dagger.core_db_api.CoreDbApi
import com.dagger.core_db_impl.di.CoreDbComponent
import com.dagger.core_db_impl.di.DbCoreDependencies
import com.dagger.feature_screen_api.ScreenFeatureApi
import com.dagger.feature_screen_impl.ScreenFeatureBuilder
import com.dagger.feature_screen_impl.di.ScreenFeatureDependencies
import com.dagger.sample.di.AppComponent

object FeatureProxyInjector {
    fun getFeatureScreenApi(): ScreenFeatureApi {
        if (!ScreenFeatureBuilder.hasComponent()) {
            ScreenFeatureBuilder.buildComponent(object : ScreenFeatureDependencies {
                override fun coreDbApi(): CoreDbApi = getCoreDb()
            })
        }
        return ScreenFeatureBuilder.getApi()
    }

    private fun getCoreDb(): CoreDbApi = CoreDbComponent.get(
        object : DbCoreDependencies {
            override fun context(): Context = AppComponent.get().context()
        }
    )
}