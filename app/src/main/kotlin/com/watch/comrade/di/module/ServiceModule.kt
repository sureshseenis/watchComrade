package com.watch.comrade.di.module

import android.app.Service
import android.content.Context
import com.watch.comrade.di.PerService
import com.watch.comrade.services.calls.InteractorCalls
import com.watch.comrade.services.calls.InterfaceInteractorCalls
import com.watch.comrade.services.calls.InterfaceServiceCalls
import com.watch.comrade.services.sms.InteractorSms
import com.watch.comrade.services.sms.InterfaceInteractorSms
import com.watch.comrade.services.sms.InterfaceServiceSms
import dagger.Module
import dagger.Provides

/**
 * Created by luis rafael on 13/03/18.
 */
@Module
class ServiceModule(var service:Service) {

    @Provides
    fun provideContext(): Context = service.applicationContext

    @Provides
    @PerService
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceServiceCalls>): InterfaceInteractorCalls<InterfaceServiceCalls> = interactor

    @Provides
    @PerService
    fun provideInterfaceInteractorSms(interactor: InteractorSms<InterfaceServiceSms>): InterfaceInteractorSms<InterfaceServiceSms> = interactor

}