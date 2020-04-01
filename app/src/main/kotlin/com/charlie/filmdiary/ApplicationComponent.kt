package com.charlie.filmdiary

import com.charlie.filmdiary.splash.SplashActivity
import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(activity: SplashActivity)
    fun inject(activity: MainActivity)
}