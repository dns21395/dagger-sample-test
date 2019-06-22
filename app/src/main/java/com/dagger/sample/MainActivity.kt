package com.dagger.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dagger.sample.di.AppComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppComponent.get().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(
            R.id.container,
            FeatureProxyInjector.getFeatureScreenApi().screen()
        ).commitNow()
    }
}
