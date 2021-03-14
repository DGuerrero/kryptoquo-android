package com.quoders.apps.kryptoquo.data.model.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "assets")
class AssetEntity {

    @PrimaryKey
    var assetId: String = ""

    @ColumnInfo(name = "name")
    var name: String? = null

    @ColumnInfo(name = "date_start")
    var dateStart: String? = null
}