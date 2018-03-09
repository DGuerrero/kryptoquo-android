package com.quoders.apps.kryptoquo.domain.repository

import com.quoders.apps.kryptoquo.domain.model.KryptoAsset
import io.reactivex.Observable

/**
 * Contract for a repository that provides KryptoAssets entities
 */
interface KryptoRepository {

    /**
     * Get an Observable which will emit a List of {@link KryptoAsset}
     */
    fun getAssets(): Observable<List<KryptoAsset>>
}