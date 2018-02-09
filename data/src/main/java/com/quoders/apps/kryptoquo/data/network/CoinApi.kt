package com.quoders.apps.kryptoquo.data.network

import model.CoinApiCoinsReponse
import retrofit2.Call
import retrofit2.http.GET

interface CoinApi {

    @GET("/v1/assets")
    fun getCoins() : Call<CoinApiCoinsReponse>

    // https://rest.coinapi.io/
}