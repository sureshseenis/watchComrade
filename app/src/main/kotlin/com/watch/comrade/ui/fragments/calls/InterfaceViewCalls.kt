package com.watch.comrade.ui.fragments.calls

import com.watch.comrade.ui.activities.base.InterfaceView
import com.watch.comrade.ui.adapters.callsadapter.CallsRecyclerAdapter

/**
 * Created by luis rafael on 12/03/18.
 */
interface InterfaceViewCalls : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: CallsRecyclerAdapter)

}