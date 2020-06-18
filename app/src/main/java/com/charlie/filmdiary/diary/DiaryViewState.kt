package com.charlie.filmdiary.diary

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DiaryViewState(
    val isLoading: Boolean = true
) : Parcelable

sealed class DiaryViewEvent {
    object ScreenLoadEvent : DiaryViewEvent()
}