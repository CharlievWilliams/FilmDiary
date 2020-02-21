package com.charlie.filmdiary

import android.app.Application

class MyApplication : Application() {
    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()
}

