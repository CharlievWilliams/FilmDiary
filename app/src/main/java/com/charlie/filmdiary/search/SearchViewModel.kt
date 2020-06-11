package com.charlie.filmdiary.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.charlie.filmdiary.extensions.LifeCycleAwareDisposable
import com.charlie.filmdiary.search.SearchViewEvent.ScreenLoadEvent
import javax.inject.Inject

class SearchViewModel @Inject constructor(
    private val lifeCycleAwareDisposable: LifeCycleAwareDisposable
) : ViewModel(), LifeCycleAwareDisposable by lifeCycleAwareDisposable {

    private val viewState = MutableLiveData(SearchViewState(true))

    fun onEvent(event: SearchViewEvent) {
        when (event) {
            is ScreenLoadEvent -> onScreenLoad()
        }
    }

    private fun onScreenLoad() {
        // Perform use case with onSuccess / onError
    }

    fun viewState(): LiveData<SearchViewState> = viewState

}