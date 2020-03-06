package com.charlie.filmdiary.api.movies

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Movies(
    val title: String
)