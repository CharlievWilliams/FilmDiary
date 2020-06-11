package com.charlie.filmdiary.search

data class SearchViewState(
    val temp: Boolean
)

sealed class SearchViewEvent {
    object ScreenLoadEvent : SearchViewEvent()
}