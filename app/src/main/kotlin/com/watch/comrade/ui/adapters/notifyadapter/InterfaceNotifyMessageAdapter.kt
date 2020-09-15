package com.watch.comrade.ui.adapters.notifyadapter

import com.watch.comrade.ui.adapters.basedapter.InterfaceAdapter


/**
 * Created by luis rafael on 20/03/18.
 */
interface InterfaceNotifyMessageAdapter : InterfaceAdapter{
    fun onItemClick(key: String?, child: String,position:Int)
    fun onItemLongClick(key: String?, child: String,position:Int)
}