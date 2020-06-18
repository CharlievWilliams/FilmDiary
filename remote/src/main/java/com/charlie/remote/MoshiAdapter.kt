package com.charlie.remote

import com.charlie.remote.movie.Movie
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import javax.inject.Inject

class MoshiAdapter @Inject constructor() {

    fun retrieveMovie(json: String): Movie? {
        val moshi: Moshi = Moshi.Builder().build()
        val adapter: JsonAdapter<Movie> = moshi.adapter(Movie::class.java)
        return adapter.fromJson(json)
    }
}