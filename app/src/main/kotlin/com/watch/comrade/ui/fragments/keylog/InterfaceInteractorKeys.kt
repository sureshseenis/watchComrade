package com.watch.comrade.ui.fragments.keylog

import com.watch.comrade.di.PerActivity
import com.watch.comrade.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 18/03/18.
 */
@PerActivity
interface InterfaceInteractorKeys<V : InterfaceViewKeys> : InterfaceInteractor<V> {
    fun valueEventEnableKeys()
}