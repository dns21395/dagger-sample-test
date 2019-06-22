package com.dagger.feature_screen_impl.di

import com.dagger.core_db_api.CoreDbApi

interface ScreenFeatureDependencies {
    fun coreDbApi(): CoreDbApi
}