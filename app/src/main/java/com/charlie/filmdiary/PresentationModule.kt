package com.charlie.filmdiary

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.charlie.filmdiary.calendar.CalendarViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(ActivityComponent::class)
abstract class PresentationModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CalendarViewModel::class)
    abstract fun bindCalendarViewModel(calendarViewModel: CalendarViewModel): ViewModel
}