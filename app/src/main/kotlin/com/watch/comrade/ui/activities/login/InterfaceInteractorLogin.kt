package com.watch.comrade.ui.activities.login

import com.watch.comrade.di.PerActivity
import com.watch.comrade.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 9/03/18.
 */
@PerActivity
interface InterfaceInteractorLogin<V : InterfaceViewLogin> : InterfaceInteractor<V> {
    fun signInDisposable(email: String, pass: String)
}