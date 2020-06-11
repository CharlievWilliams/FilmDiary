package com.charlie.filmdiary

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class AppModule {

    @Provides
    fun lifeCycleAwareDisposable(default: LifeCycleAwareDisposable.Default): LifeCycleAwareDisposable =
        default
}