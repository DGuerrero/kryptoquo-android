package com.quoders.apps.kryptoquo.assets

import android.app.AlertDialog
import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.support.v4.widget.ContentLoadingProgressBar
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.quoders.apps.kryptoquo.R
import com.quoders.apps.kryptoquo.assets.dummy.DummyContent
import com.quoders.apps.kryptoquo.assets.dummy.DummyContent.DummyItem

class AssetsCatalogFragment : Fragment(), AssetsCatalogView {

    lateinit var presenter: AssetsCatalogPresenter
    lateinit var progressBar: ContentLoadingProgressBar
    lateinit var recyclerViewAssets: RecyclerView

    var dialog: AlertDialog? = null

    private var mColumnCount = 1
    private var mListener: OnListFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments != null) {
            mColumnCount = arguments.getInt(ARG_COLUMN_COUNT)
        }

        presenter = AssetsCatalogPresenter(this)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_assets_catalog, container, false)

        recyclerViewAssets = view.findViewById(R.id.recyclerViewAssets)
        recyclerViewAssets.layoutManager = LinearLayoutManager(view.context)
        recyclerViewAssets.adapter = AssetsCatalogRecyclerViewAdapter(DummyContent.ITEMS, mListener)

        progressBar = view.findViewById(R.id.progressBarAssetsCatalog)

        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnListFragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnListFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    override fun onResume() {
        super.onResume()
        presenter.resume()
    }

    override fun onPause() {
        super.onPause()
        presenter.pause()
    }

    override fun showLoadingProgress() {
        progressBar.show()
    }

    override fun hideLoadingProgress() {
        progressBar.hide()
    }

    override fun showError() {
        dismissDialog()

        dialog = AlertDialog.Builder(activity)
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
        return activity
    }

    interface OnListFragmentInteractionListener {
        fun onListFragmentInteraction(item: DummyItem)
    }

    companion object {

        private val ARG_COLUMN_COUNT = "column-count"

        fun newInstance(columnCount: Int): AssetsCatalogFragment {
            val fragment = AssetsCatalogFragment()
            val args = Bundle()
            args.putInt(ARG_COLUMN_COUNT, columnCount)
            fragment.arguments = args
            return fragment
        }
    }
}
