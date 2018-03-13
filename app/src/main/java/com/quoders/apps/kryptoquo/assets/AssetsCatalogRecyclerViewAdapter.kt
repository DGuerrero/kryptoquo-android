package com.quoders.apps.kryptoquo.assets

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.quoders.apps.kryptoquo.R

import com.quoders.apps.kryptoquo.assets.AssetsCatalogFragment.OnListFragmentInteractionListener
import com.quoders.apps.kryptoquo.assets.dummy.DummyContent.DummyItem

class AssetsCatalogRecyclerViewAdapter(private val mValues: List<DummyItem>,
                                       private val mListener: OnListFragmentInteractionListener?) :
        RecyclerView.Adapter<AssetsCatalogRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.assets_catalog_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mItem = mValues[position]
        holder.mIdView.text = mValues[position].id
        holder.mContentView.text = mValues[position].content

        holder.mView.setOnClickListener {
            mListener?.onListFragmentInteraction(holder.mItem!!)
        }
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: TextView = mView.findViewById(R.id.id) as TextView
        val mContentView: TextView = mView.findViewById(R.id.content) as TextView
        var mItem: DummyItem? = null

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
