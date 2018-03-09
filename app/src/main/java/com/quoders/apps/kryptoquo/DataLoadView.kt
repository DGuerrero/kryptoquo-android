package com.quoders.apps.kryptoquo

import android.content.Context

interface DataLoadView {

    fun showLoadingProgress()

    fun hideLoadingProgress()

    fun showError()

    fun context(): Context
}