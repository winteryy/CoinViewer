package com.example.coinviewer.view.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.coinviewer.R
import timber.log.Timber

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Timber.d("onCreate")
    }
}