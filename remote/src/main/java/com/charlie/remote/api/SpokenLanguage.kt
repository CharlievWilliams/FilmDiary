package com.charlie.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SpokenLanguage(
    @Json(name = "iso_639_1")
    val iso6391: String,
    val name: String
)