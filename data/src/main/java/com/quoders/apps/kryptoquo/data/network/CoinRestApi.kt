package com.quoders.apps.kryptoquo.data.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class CoinRestApi {

    private val coinRestApi: CoinApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://rest.coinapi.io/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        coinRestApi = retrofit.create(CoinApi::class.java)
    }
}