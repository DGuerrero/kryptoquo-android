package com.quoders.apps.kryptoquo.data.db

import android.arch.persistence.room.*
import com.quoders.apps.kryptoquo.data.model.local.AssetEntity
import io.reactivex.Flowable



@Dao
interface AssetDao {

    @Query("SELECT * FROM assets")
    fun getAll(): List<AssetEntity>

    @Query("SELECT * from assets")
    fun getAllFlowable(): Flowable<AssetEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg assetEntity: AssetEntity)
/*

    @Delete
    fun delete(assetId: String)
*/
}