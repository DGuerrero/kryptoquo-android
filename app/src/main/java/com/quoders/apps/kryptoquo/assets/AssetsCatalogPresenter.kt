package com.quoders.apps.kryptoquo.assets

import com.quoders.apps.kryptoquo.Presenter
import com.quoders.apps.kryptoquo.domain.GetAssetsInteractor
import com.quoders.apps.kryptoquo.domain.model.KryptoAsset
import io.reactivex.observers.DisposableObserver

class AssetsCatalogPresenter(private var view: AssetsCatalogView) : Presenter {

    private var getAssetsInteractor: GetAssetsInteractor = GetAssetsInteractor()

    override fun resume() {
        view.showLoadingProgress()
        getAssetsInteractor.execute(AssetsCatalogObserver(), null)
    }

    override fun pause() {
        view.hideLoadingProgress()
    }

    override fun destroy() {

    }

    fun displayAssetsCatalog() {

    }

    inner class AssetsCatalogObserver : DisposableObserver<List<KryptoAsset>>() {
        override fun onComplete() {
            view.hideLoadingProgress()
        }

        override fun onNext(t: List<KryptoAsset>) {
            displayAssetsCatalog()
        }

        override fun onError(e: Throwable) {
            view.hideLoadingProgress();
            view.showError()
        }
    }
}