package com.quoders.apps.kryptoquo.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.quoders.apps.kryptoquo.data.model.local.AssetEntity

@Dao
interface AssetDao {

    @Query("SELECT * FROM assets")
    fun getAll(): List<AssetEntity>

    @Query("SELECT * from assets")
    fun getAllFlowable(): AssetEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg assetEntity: AssetEntity)

}