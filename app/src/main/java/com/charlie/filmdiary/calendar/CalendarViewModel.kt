package com.charlie.filmdiary.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.charlie.filmdiary.calendar.CalendarViewEvent.ScreenLoadEvent
import com.charlie.filmdiary.extensions.LifeCycleAwareDisposable
import javax.inject.Inject

class CalendarViewModel @Inject constructor(
    private val lifeCycleAwareDisposable: LifeCycleAwareDisposable
) : ViewModel(), LifeCycleAwareDisposable by lifeCycleAwareDisposable {

    private val viewState: MutableLiveData<CalendarViewState> = MutableLiveData()

    fun onEvent(event: CalendarViewEvent) {
        when (event) {
            is ScreenLoadEvent -> onScreenLoad()
        }
    }

    private fun onScreenLoad() {
        // Perform use case with onSuccess / onError
    }

    private fun onScreenLoadSuccess() {
        viewState.value = CalendarViewState(
            isLoading = false
        )
    }

    fun viewState(): LiveData<CalendarViewState> = viewState

}