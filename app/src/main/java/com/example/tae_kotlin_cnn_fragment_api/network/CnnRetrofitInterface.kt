package com.example.tae_kotlin_cnn_fragment_api.network

import CnnModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CnnRetrofitInterface {

    @GET ("top-headlines?country=us&apiKey=")
    fun getTopHeadLines(@Query("api_key")api_key:String): Call<CnnModel>
}

//top-headlines?country=us&apiKey=