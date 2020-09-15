package com.watch.comrade.ui.fragments.maps

import com.watch.comrade.di.PerActivity
import com.watch.comrade.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 11/03/18.
 */
@PerActivity
interface InterfaceInteractorMaps<V : InterfaceViewMaps> : InterfaceInteractor<V> {
    fun valueEventLocation()
    fun valueEventEnableGps()
    fun valueEventEnablePermission()
}