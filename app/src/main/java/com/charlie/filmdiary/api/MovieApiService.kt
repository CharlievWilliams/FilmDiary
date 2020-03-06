package com.charlie.filmdiary.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object MovieApiService {

    private val interceptor = Interceptor { chain ->
        val url = chain.request().url().newBuilder().addQueryParameter("apiKey", API_KEY).build()
        val request = chain.request()
            .newBuilder()
            .url(url)
            .build()
        chain.proceed(request)
    }

    private val apiClient = OkHttpClient().newBuilder().addInterceptor(interceptor).build()

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().client(apiClient)
            .baseUrl("https://api.themoviedb.org/")
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }

    val movieApi: MovieApiInterface = getRetrofit().create(MovieApiInterface::class.java)

    private const val API_KEY = "1866f49ed1f23d71e5cbc668c0ab5bf8"
}