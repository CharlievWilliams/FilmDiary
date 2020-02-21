package com.charlie.filmdiary

import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}