package com.quoders.apps.kryptoquo.data.repository

import com.quoders.apps.kryptoquo.data.model.local.AssetEntity
import io.reactivex.Observable

class KryptoAssetsRepository : KryptoRepository {

    override fun getAssets(): Observable<List<AssetEntity>> {
        //  TODO
        return Observable.empty()
    }

}