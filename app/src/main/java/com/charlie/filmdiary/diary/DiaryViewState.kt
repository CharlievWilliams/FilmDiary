package com.charlie.filmdiary.diary

data class DiaryViewState(
    val temp: Boolean
)

sealed class DiaryViewEvent {
    object ScreenLoadEvent : DiaryViewEvent()
}