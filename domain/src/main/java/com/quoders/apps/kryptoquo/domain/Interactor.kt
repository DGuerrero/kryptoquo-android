package com.quoders.apps.kryptoquo.domain

import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Executor


abstract class Interactor<T, in Params>(val executor: Executor) {

    private val disposables: CompositeDisposable = CompositeDisposable()

    abstract fun buildInteractor(params: Params): Observable<T>

    fun execute(observer: DisposableObserver<T>, params: Params) {
        val observable: Observable<T> = buildInteractor(params)
                .subscribeOn(Schedulers.from(executor))

        disposables.add(observable.subscribeWith(observer))
    }

    fun dispose() {
        if(!disposables.isDisposed) {
            disposables.dispose()
        }
    }
}