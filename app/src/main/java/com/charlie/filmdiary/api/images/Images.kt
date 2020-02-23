package com.charlie.filmdiary.api.images


import com.google.gson.annotations.SerializedName

data class Images(
    val backdrops: List<Any>,
    val id: Int,
    val posters: List<Any>
)