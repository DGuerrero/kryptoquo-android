package com.quoders.apps.kryptoquo.domain.assets

import com.quoders.apps.kryptoquo.domain.Interactor
import com.quoders.apps.kryptoquo.domain.model.KryptoAsset
import com.quoders.apps.kryptoquo.domain.repository.KryptoAssetsRepository
import io.reactivex.Observable

class GetAssetsInteractor() : Interactor<List<KryptoAsset>, Void?>() {

    lateinit var assetsRepository: KryptoAssetsRepository

    override fun buildInteractor(params: Void?): Observable<List<KryptoAsset>> {
        return assetsRepository.getAssets()
    }

}