package com.charlie.filmdiary.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.charlie.filmdiary.extensions.LifeCycleAwareDisposable
import com.charlie.filmdiary.calendar.CalendarViewEvent.ScreenLoadEvent
import javax.inject.Inject

class CalendarViewModel @Inject constructor(
    private val lifeCycleAwareDisposable: LifeCycleAwareDisposable
) : ViewModel(), LifeCycleAwareDisposable by lifeCycleAwareDisposable {

    private val viewState = MutableLiveData(CalendarViewState(true))

    fun onEvent(event: CalendarViewEvent) {
        when (event) {
            is ScreenLoadEvent -> onScreenLoad()
        }
    }

    private fun onScreenLoad() {
        // Perform use case with onSuccess / onError
    }

    fun viewState(): LiveData<CalendarViewState> = viewState

}