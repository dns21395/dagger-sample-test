package com.dagger.sample

import android.app.Application
import com.dagger.sample.di.AppComponent
import com.dagger.sample.di.AppModule
import com.dagger.sample.di.DaggerAppComponent

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppComponent.init(
            DaggerAppComponent.builder().appModule(AppModule(applicationContext)).build()
        )
        AppComponent.get().inject(this)
    }
}