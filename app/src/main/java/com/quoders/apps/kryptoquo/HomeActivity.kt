package com.quoders.apps.kryptoquo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.quoders.apps.kryptoquo.assets.AssetsCatalogFragment
import com.quoders.apps.kryptoquo.assets.dummy.DummyContent

class HomeActivity : AppCompatActivity(), AssetsCatalogFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fragmentManager.beginTransaction().replace(R.id.frameLayoutHomeContainer,
                AssetsCatalogFragment.newInstance(1)).commit()
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
