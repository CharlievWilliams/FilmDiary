package com.charlie.filmdiary.calendar

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CalendarViewState(
    val isLoading: Boolean = true
) : Parcelable

sealed class CalendarViewEvent {
    object ScreenLoadEvent : CalendarViewEvent()
}