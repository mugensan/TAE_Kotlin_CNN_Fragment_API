package com.example.tae_kotlin_cnn_fragment_api.network

import com.example.tae_kotlin_cnn_fragment_api.common.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    val retrofitInstance:Retrofit
        get() {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            val okHttpClient= OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build()

            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            return Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
}