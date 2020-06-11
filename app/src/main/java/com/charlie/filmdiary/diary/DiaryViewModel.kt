package com.charlie.filmdiary.diary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.charlie.filmdiary.extensions.LifeCycleAwareDisposable
import com.charlie.filmdiary.diary.DiaryViewEvent.ScreenLoadEvent
import javax.inject.Inject

class DiaryViewModel @Inject constructor(
    private val lifeCycleAwareDisposable: LifeCycleAwareDisposable
) : ViewModel(), LifeCycleAwareDisposable by lifeCycleAwareDisposable {

    private val viewState = MutableLiveData(DiaryViewState(true))

    fun onEvent(event: DiaryViewEvent) {
        when (event) {
            is ScreenLoadEvent -> onScreenLoad()
        }
    }

    private fun onScreenLoad() {
        // Perform use case with onSuccess / onError
    }

    fun viewState(): LiveData<DiaryViewState> = viewState

}