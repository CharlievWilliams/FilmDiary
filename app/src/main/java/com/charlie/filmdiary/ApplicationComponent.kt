package com.charlie.filmdiary

import com.charlie.filmdiary.calendar.CalendarFragment
import com.charlie.filmdiary.diary.DiaryFragment
import com.charlie.filmdiary.search.SearchFragment
import com.charlie.filmdiary.splash.SplashActivity
import dagger.Component

@Component(
    modules = [AppModule::class, PresentationModule::class, RemoteModule::class]
)
interface ApplicationComponent {
    fun inject(activity: SplashActivity)
    fun inject(activity: MainActivity)
    fun inject(fragment: CalendarFragment)
    fun inject(fragment: DiaryFragment)
    fun inject(fragment: SearchFragment)
}