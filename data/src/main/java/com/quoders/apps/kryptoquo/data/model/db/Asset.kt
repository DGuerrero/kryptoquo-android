package com.quoders.apps.kryptoquo.data.model.db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.ColumnInfo

@Entity(tableName = "assets")
class Asset {

    @PrimaryKey
    var assetId: String = ""

    @ColumnInfo(name = "name")
    var name: String? = null

    @ColumnInfo(name = "date_start")
    var dateStart: String? = null
}