package com.dagger.feature_screen_impl

import androidx.fragment.app.Fragment
import com.dagger.feature_screen_api.ScreenFeatureApi

class ScreenFeatureApiImpl : ScreenFeatureApi {
    override fun screen(): Fragment = ScreenFragment()
}