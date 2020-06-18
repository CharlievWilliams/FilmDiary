package com.charlie.filmdiary.diary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.charlie.filmdiary.diary.DiaryViewEvent.ScreenLoadEvent
import com.charlie.filmdiary.extensions.LifeCycleAwareDisposable
import javax.inject.Inject

class DiaryViewModel @Inject constructor(
    private val lifeCycleAwareDisposable: LifeCycleAwareDisposable
) : ViewModel(), LifeCycleAwareDisposable by lifeCycleAwareDisposable {

    private val viewState: MutableLiveData<DiaryViewState> = MutableLiveData()

    fun onEvent(event: DiaryViewEvent) {
        when (event) {
            is ScreenLoadEvent -> onScreenLoad()
        }
    }

    private fun onScreenLoad() {
        // Perform use case with onSuccess / onError
    }

    private fun onScreenLoadSuccess() {
        viewState.value = DiaryViewState(
            isLoading = false
        )
    }

    fun viewState(): LiveData<DiaryViewState> = viewState

}