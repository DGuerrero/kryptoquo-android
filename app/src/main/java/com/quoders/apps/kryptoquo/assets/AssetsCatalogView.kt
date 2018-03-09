package com.quoders.apps.kryptoquo.assets

import android.content.Context
import com.quoders.apps.kryptoquo.DataLoadView

interface AssetsCatalogView : DataLoadView {

    override fun showLoadingProgress()

    override fun hideLoadingProgress()

    override fun showError()

    override fun context(): Context
}