package com.watch.comrade.di.component

import com.watch.comrade.app.IsTheApp
import com.watch.comrade.data.rxFirebase.InterfaceFirebase
import com.watch.comrade.di.module.AppModule
import com.watch.comrade.di.module.FirebaseModule
import com.watch.comrade.services.accessibilityData.AccessibilityDataService
import com.watch.comrade.services.notificationService.NotificationService
import dagger.Component
import javax.inject.Singleton

/**
 * Created by luis rafael on 13/03/18.
 */
@Singleton
@Component(modules = [AppModule::class, FirebaseModule::class])
interface AppComponent {

    fun inject(app: IsTheApp)
    fun inject(accessibilityDataService: AccessibilityDataService)
    fun inject(notificationService: NotificationService)
    fun getInterfaceFirebase(): InterfaceFirebase

}