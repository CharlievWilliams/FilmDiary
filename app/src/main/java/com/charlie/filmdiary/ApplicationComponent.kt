package com.charlie.filmdiary

import dagger.Component

@Component(
    modules = [AppModule::class, PresentationModule::class, RemoteModule::class]
)
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}