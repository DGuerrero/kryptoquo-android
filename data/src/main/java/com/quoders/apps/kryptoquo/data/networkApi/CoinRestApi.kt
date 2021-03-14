package com.quoders.apps.kryptoquo.data.networkApi

import com.quoders.apps.kryptoquo.data.model.network.AssetApiEntity
import retrofit2.Call
import retrofit2.Retrofit

class CoinRestApi {

    private val coinRestApi: CoinApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://rest.coinapi.io/")
                //.addConverterFactory(MoshiConverterFactory.create())
                .build()

        coinRestApi = retrofit.create(CoinApi::class.java)
    }


    fun getCoinAssets() : Call<AssetApiEntity> {
        return coinRestApi.getAssets()
    }
}