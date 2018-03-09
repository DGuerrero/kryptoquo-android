package com.quoders.apps.kryptoquo.domain

import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers


abstract class Interactor<T, in Params> {

    private val disposables: CompositeDisposable = CompositeDisposable()

    abstract fun buildInteractor(params: Params?): Observable<T>

    fun execute(observer: DisposableObserver<T>, params: Params?) {
        val observable: Observable<T> = buildInteractor(params)
                .subscribeOn(Schedulers.newThread())

        disposables.add(observable.subscribeWith(observer))
    }

    fun dispose() {
        if(!disposables.isDisposed) {
            disposables.dispose()
        }
    }
}