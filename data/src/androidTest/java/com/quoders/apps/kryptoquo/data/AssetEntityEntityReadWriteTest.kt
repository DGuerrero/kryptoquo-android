package com.quoders.apps.kryptoquo.data

import android.arch.persistence.room.Room
import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.quoders.apps.kryptoquo.data.db.AppDatabase
import com.quoders.apps.kryptoquo.data.model.local.AssetEntity
import com.quoders.apps.kryptoquo.data.db.AssetDao
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AssetEntityEntityReadWriteTest {

    lateinit var appDatabase: AppDatabase
    lateinit var assetDao: AssetDao

    @Before
    fun setup() {
        val context: Context = InstrumentationRegistry.getTargetContext()
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java).build()
        assetDao = appDatabase.assetDao()
    }

    @After
    fun closeDb() = appDatabase.close()

    @Test
    fun writeAssetAndReadInList() {
        var asset = AssetEntity()
        asset.assetId = "ZCG"
        asset.name = "Zlancer"
        asset.dateStart = "2018-01-24"

        assetDao.insertAll(asset)
        val allAssets = assetDao.getAll()

        assertTrue(allAssets.size == 1)
    }
}