package com.watch.comrade.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.watch.comrade.services.social.MonitorService
import com.watch.comrade.utils.Consts.RESTART_MONITOR_RECEIVER
import com.pawegio.kandroid.IntentFor

/**
 * Created by luis rafael on 13/03/18.
 */
class MonitorReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == RESTART_MONITOR_RECEIVER) context.startService(IntentFor<MonitorService>(context))
    }
}