package com.quoders.apps.kryptoquo.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.quoders.apps.kryptoquo.data.model.local.AssetEntity


@Database(entities = [(AssetEntity::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        val KRYPTOQUO_DATABASE_NAME : String = "kryptoquo_database"
    }

    abstract fun assetDao(): AssetDao
}