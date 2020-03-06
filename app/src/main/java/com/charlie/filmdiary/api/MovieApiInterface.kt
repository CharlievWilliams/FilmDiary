package com.charlie.filmdiary.api

import com.charlie.filmdiary.api.movies.Movies
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiInterface {
    @GET("3/movie/452345")
    fun fetchMovieAsync(@Query("q") query: String): Deferred<Response<Movies>>
}

sealed class Output<out T : Any> {
    data class Success<out T : Any>(val output: T) : Output<T>()
    data class Error(val exception: Exception) : Output<Nothing>()
}

