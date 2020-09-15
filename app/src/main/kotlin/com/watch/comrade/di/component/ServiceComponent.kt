package com.watch.comrade.di.component

import com.watch.comrade.di.PerService
import com.watch.comrade.di.component.AppComponent
import com.watch.comrade.di.module.ServiceModule
import com.watch.comrade.services.calls.CallsService
import com.watch.comrade.services.sms.SmsService
import com.watch.comrade.services.social.MonitorService
import dagger.Component

/**
 * Created by luis rafael on 13/03/18.
 */
@PerService
@Component(dependencies = [AppComponent::class], modules = [ServiceModule::class])
interface ServiceComponent {

    fun inject(callsService: CallsService)
    fun inject(smsService: SmsService)
    fun inject(monitorService: MonitorService)

}