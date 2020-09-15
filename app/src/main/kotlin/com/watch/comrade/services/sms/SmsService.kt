package com.watch.comrade.services.sms

import android.content.Intent
import com.watch.comrade.services.base.BaseService
import com.watch.comrade.utils.Consts.SMS_ADDRESS
import com.watch.comrade.utils.Consts.SMS_BODY
import com.watch.comrade.utils.Consts.TYPE_SMS
import javax.inject.Inject

/**
 * Created by luis rafael on 13/03/18.
 */
class SmsService : BaseService(), InterfaceServiceSms {

    @Inject lateinit var interactor: InterfaceInteractorSms<InterfaceServiceSms>

    override fun onCreate() {
        super.onCreate()
        if (getComponent() != null) {
            getComponent()!!.inject(this)
            interactor.onAttach(this)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.setSmsIntent()
        return super.onStartCommand(intent, flags, startId)
    }

    private fun Intent.setSmsIntent() {
        interactor.setPushSms(getStringExtra(SMS_ADDRESS), getStringExtra(SMS_BODY),getIntExtra(TYPE_SMS,0))
    }

    override fun stopServiceSms() {
        stopSelf()
    }

    override fun onDestroy() {
        interactor.onDetach()
        super.onDestroy()
    }


}