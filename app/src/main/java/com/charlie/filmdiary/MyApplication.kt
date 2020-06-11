package com.charlie.filmdiary

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
import androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    val appComponent: ApplicationComponent = DaggerApplicationComponent.builder().build()

    override fun onCreate() {
        super.onCreate()
        setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
    }
}

