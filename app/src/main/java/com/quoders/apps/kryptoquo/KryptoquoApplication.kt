package com.quoders.apps.kryptoquo

import android.app.Application
import android.arch.persistence.room.Room
import com.quoders.apps.kryptoquo.data.db.AppDatabase

class KryptoquoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appDatabase = Room.databaseBuilder(applicationContext,
                AppDatabase::class.java, "database-name").build()
    }
}