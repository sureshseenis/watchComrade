package com.watch.comrade.services.sms

import android.content.Context
import com.watch.comrade.data.rxFirebase.InterfaceFirebase
import com.watch.comrade.data.model.Sms
import com.watch.comrade.services.base.BaseInteractorService
import com.watch.comrade.utils.ConstFun.getDateTime
import com.watch.comrade.utils.Consts.DATA
import com.watch.comrade.utils.Consts.SMS
import javax.inject.Inject

/**
 * Created by luis rafael on 27/03/18.
 */
class InteractorSms<S : InterfaceServiceSms> @Inject constructor(context: Context, firebase: InterfaceFirebase) : BaseInteractorService<S>(context, firebase), InterfaceInteractorSms<S> {

    override fun setPushSms(smsAddress: String, smsBody: String,type: Int) {
        val sms = Sms(smsAddress, smsBody, getDateTime(),type)
        firebase().getDatabaseReference("$SMS/$DATA").push().setValue(sms).addOnCompleteListener {
            if (isNullService()) getService()!!.stopServiceSms()
        }
    }

}