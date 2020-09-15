package com.watch.comrade.ui.fragments.message

import com.watch.comrade.di.PerActivity
import com.watch.comrade.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 20/03/18.
 */
@PerActivity
interface InterfaceInteractorMessage<V : InterfaceViewMessage> : InterfaceInteractor<V>