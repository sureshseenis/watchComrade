package com.watch.comrade.di.component;

import java.lang.System;

/**
 * Created by luis rafael on 13/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/watch/comrade/di/component/AppComponent;", "", "getInterfaceFirebase", "Lcom/watch/comrade/data/rxFirebase/InterfaceFirebase;", "inject", "", "app", "Lcom/watch/comrade/app/IsTheApp;", "accessibilityDataService", "Lcom/watch/comrade/services/accessibilityData/AccessibilityDataService;", "notificationService", "Lcom/watch/comrade/services/notificationService/NotificationService;", "app_debug"})
@dagger.Component(modules = {com.watch.comrade.di.module.AppModule.class, com.watch.comrade.di.module.FirebaseModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.app.IsTheApp app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.services.accessibilityData.AccessibilityDataService accessibilityDataService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.services.notificationService.NotificationService notificationService);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.watch.comrade.data.rxFirebase.InterfaceFirebase getInterfaceFirebase();
}