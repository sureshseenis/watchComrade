package com.watch.comrade.ui.fragments.message

import com.watch.comrade.ui.activities.base.InterfaceView
import com.watch.comrade.ui.adapters.smsadapter.SmsRecyclerAdapter

/**
 * Created by luis rafael on 20/03/18.
 */
interface InterfaceViewMessage : InterfaceView {

    fun setRecyclerAdapter(smsRecyclerAdapter: SmsRecyclerAdapter)

}