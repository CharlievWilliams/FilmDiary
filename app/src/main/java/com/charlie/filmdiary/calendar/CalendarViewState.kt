package com.charlie.filmdiary.calendar

data class CalendarViewState(
    val temp: Boolean
)

sealed class CalendarViewEvent {
    object ScreenLoadEvent : CalendarViewEvent()
}