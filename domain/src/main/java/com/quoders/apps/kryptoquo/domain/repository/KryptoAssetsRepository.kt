package com.quoders.apps.kryptoquo.domain.repository

import com.quoders.apps.kryptoquo.domain.model.KryptoAsset
import io.reactivex.Observable

class KryptoAssetsRepository : KryptoRepository {
    override fun getAssets(): Observable<List<KryptoAsset>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}