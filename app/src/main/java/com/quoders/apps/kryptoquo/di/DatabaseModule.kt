package com.quoders.apps.kryptoquo.di

import android.arch.persistence.room.Room
import android.content.Context
import com.quoders.apps.kryptoquo.data.db.AppDatabase
import com.quoders.apps.kryptoquo.data.db.AppDatabase.Companion.KRYPTOQUO_DATABASE_NAME
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides @Singleton fun providesDatabase(context: Context) : AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, KRYPTOQUO_DATABASE_NAME).build()
    }
}