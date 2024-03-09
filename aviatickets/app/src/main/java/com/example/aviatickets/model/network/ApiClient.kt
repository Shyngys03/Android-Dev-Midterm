package com.example.aviatickets.model.network

import com.example.aviatickets.model.service.FakeService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/estharossa/fake-api-demo/offer_list")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    /**
     * think about performing network request
     */
    val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}