package com.dagger.sample.di

import android.content.Context
import androidx.annotation.NonNull
import com.dagger.sample.App
import com.dagger.sample.MainActivity
import dagger.Component
import dagger.internal.Preconditions
import javax.inject.Singleton

@Component(
    modules = [
        AppModule::class
    ]
)
@Singleton
abstract class AppComponent {
    companion object {
        @Volatile
        private var instance: AppComponent? = null

        @NonNull
        fun get(): AppComponent = Preconditions.checkNotNull(
            instance,
            "AppComponent is not initialized yet. Call init first."
        )!!

        fun init(@NonNull component: AppComponent) {
            if (instance != null) {
                throw IllegalArgumentException("AppComponent is already initialized.")
            }
            instance = component
        }
    }

    abstract fun context(): Context

    abstract fun inject(activity: MainActivity)
    abstract fun inject(app: App)
}