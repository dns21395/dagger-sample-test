package com.dagger.feature_screen_impl.di.screen

import com.dagger.core_utils.PerScreen
import com.dagger.feature_screen_impl.ScreenFragment
import dagger.Subcomponent

@PerScreen
@Subcomponent(modules = [ScreenModule::class])
interface ScreenComponent {
    fun inject(fragment: ScreenFragment)
}