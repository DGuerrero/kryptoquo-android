package com.quoders.apps.kryptoquo.data.model.db

import android.arch.persistence.room.*
import io.reactivex.Flowable



@Dao
interface AssetDao {

    @Query("SELECT * FROM assets")
    fun getAll(): List<Asset>

    @Query("SELECT * from assets")
    fun getAllFlowable(): Flowable<Asset>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg asset: Asset)

/*
    @Delete
    fun delete(assetId: String)
*/
}