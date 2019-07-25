package com.example.rentalmobil2

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

const val BASE_URL = "http://172.16.10.15/myapi/api.php/"

interface MobilApi {

    @GET("mobil")
    fun getMobil() : Call<List<Mobil>>

    companion object {

        operator fun invoke() : MobilApi{
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MobilApi::class.java)
        }
    }
}