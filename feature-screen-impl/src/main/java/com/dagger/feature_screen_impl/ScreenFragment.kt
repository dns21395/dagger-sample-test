package com.dagger.feature_screen_impl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ScreenFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        ScreenFeatureBuilder.getComponent().screenComponent().inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_screen, container, false)
}