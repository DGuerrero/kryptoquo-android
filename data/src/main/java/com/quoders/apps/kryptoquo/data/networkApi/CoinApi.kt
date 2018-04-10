package com.quoders.apps.kryptoquo.data.networkApi

import model.AssetApiEntity
import retrofit2.Call
import retrofit2.http.GET

interface CoinApi {
    @GET("/v1/assets")
    fun getAssets() : Call<AssetApiEntity>
}