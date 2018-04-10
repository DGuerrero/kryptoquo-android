package com.quoders.apps.kryptoquo.data.repository

import com.quoders.apps.kryptoquo.data.model.local.AssetEntity
import io.reactivex.Observable

/**
 * Contract for a repository that provides KryptoAssets entities
 */
interface KryptoRepository {

    /**
     * Get an Observable which will emit a List of {@link KryptoAsset}
     */
    fun getAssets(): Observable<List<AssetEntity>>
}