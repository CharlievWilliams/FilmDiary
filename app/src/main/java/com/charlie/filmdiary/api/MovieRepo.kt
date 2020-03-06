package com.charlie.filmdiary.api

class MovieRepo(private val apiInterface: MovieApiInterface) : BaseRepository() {

    suspend fun getMovie(): String? {
        return safeApiCall(
            call = { apiInterface.fetchMovieAsync("").await() },
            error = "Error fetching movie"
        )?.title
    }
}