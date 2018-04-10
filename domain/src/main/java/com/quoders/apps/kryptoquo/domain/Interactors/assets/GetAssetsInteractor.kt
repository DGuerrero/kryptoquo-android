package com.quoders.apps.kryptoquo.domain.Interactors.assets

import com.quoders.apps.kryptoquo.domain.Interactor
import com.quoders.apps.kryptoquo.domain.model.KryptoAsset
import io.reactivex.Observable

class GetAssetsInteractor : Interactor<List<KryptoAsset>, Void?>() {

    override fun buildInteractor(params: Void?): Observable<List<KryptoAsset>> {

        return KryptoAssetsRepository().getAssets()
    }

}