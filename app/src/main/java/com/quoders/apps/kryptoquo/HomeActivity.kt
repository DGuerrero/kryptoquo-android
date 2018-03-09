package com.quoders.apps.kryptoquo

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.support.v4.widget.ContentLoadingProgressBar
import android.support.v7.app.AppCompatActivity
import com.quoders.apps.kryptoquo.assets.AssetsCatalogPresenter

class HomeActivity : AppCompatActivity(), DataLoadView {

    lateinit var presenter: AssetsCatalogPresenter
    lateinit var progressBar: ContentLoadingProgressBar
    var dialog: AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        progressBar = findViewById(R.id.progressBarHomeScreen)
    }

    override fun onStop() {
        super.onStop()
        dismissDialog()
    }

    override fun showLoadingProgress() {
        progressBar.show()
    }

    override fun hideLoadingProgress() {
        progressBar.hide()
    }

    override fun showError() {
        dismissDialog()

        dialog = AlertDialog.Builder(this)
                .setTitle(R.string.dialog_error_generic_title)
                .setMessage(R.string.dialog_error_generic_message)
                .setNeutralButton(R.string.dialog_button_ok, null)
                .create()

        dialog!!.show()
    }

    private fun dismissDialog() {
        dialog!!.dismiss()
        dialog = null
    }

    override fun context(): Context {
        return this
    }
}
