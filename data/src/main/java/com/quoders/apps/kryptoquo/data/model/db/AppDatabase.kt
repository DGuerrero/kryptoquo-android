package com.quoders.apps.kryptoquo.data.model.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = [(Asset::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun assetDao(): AssetDao
}