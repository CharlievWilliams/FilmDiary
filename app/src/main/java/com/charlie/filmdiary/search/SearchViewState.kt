package com.charlie.filmdiary.search

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchViewState(
    val isLoading: Boolean = true
) : Parcelable

sealed class SearchViewEvent {
    object ScreenLoadEvent : SearchViewEvent()
}