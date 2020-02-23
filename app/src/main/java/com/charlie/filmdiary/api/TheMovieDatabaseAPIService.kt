package com.charlie.filmdiary.api

import com.charlie.filmdiary.api.details.Details
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "?api_key=1866f49ed1f23d71e5cbc668c0ab5bf8"

//https://api.themoviedb.org/3/movie/324857?api_key=1866f49ed1f23d71e5cbc668c0ab5bf8

interface TheMovieDatabaseAPIService {

    @GET("movie/")
    fun getMovieAsync(

    ): Deferred<Details>

    companion object {
        operator fun invoke(): TheMovieDatabaseAPIService {
            val requestInterceptor = Interceptor { chain ->
                val url = chain.request()
                    .url()
                    .newBuilder()
                    .addQueryParameter("api_key", API_KEY)
                    .build()

                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()

                return@Interceptor chain.proceed(request)
            }

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.themoviedb.org/3/movie/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TheMovieDatabaseAPIService::class.java)
        }
    }
}