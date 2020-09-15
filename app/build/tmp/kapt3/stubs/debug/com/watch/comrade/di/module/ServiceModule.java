package com.watch.comrade.di.module;

import java.lang.System;

/**
 * Created by luis rafael on 13/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0013"}, d2 = {"Lcom/watch/comrade/di/module/ServiceModule;", "", "service", "Landroid/app/Service;", "(Landroid/app/Service;)V", "getService", "()Landroid/app/Service;", "setService", "provideContext", "Landroid/content/Context;", "provideInterfaceInteractorCalls", "Lcom/watch/comrade/services/calls/InterfaceInteractorCalls;", "Lcom/watch/comrade/services/calls/InterfaceServiceCalls;", "interactor", "Lcom/watch/comrade/services/calls/InteractorCalls;", "provideInterfaceInteractorSms", "Lcom/watch/comrade/services/sms/InterfaceInteractorSms;", "Lcom/watch/comrade/services/sms/InterfaceServiceSms;", "Lcom/watch/comrade/services/sms/InteractorSms;", "app_debug"})
@dagger.Module()
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull()
    private android.app.Service service;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerService()
    @dagger.Provides()
    public final com.watch.comrade.services.calls.InterfaceInteractorCalls<com.watch.comrade.services.calls.InterfaceServiceCalls> provideInterfaceInteractorCalls(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.services.calls.InteractorCalls<com.watch.comrade.services.calls.InterfaceServiceCalls> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerService()
    @dagger.Provides()
    public final com.watch.comrade.services.sms.InterfaceInteractorSms<com.watch.comrade.services.sms.InterfaceServiceSms> provideInterfaceInteractorSms(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.services.sms.InteractorSms<com.watch.comrade.services.sms.InterfaceServiceSms> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Service getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.NotNull()
    android.app.Service p0) {
    }
    
    public ServiceModule(@org.jetbrains.annotations.NotNull()
    android.app.Service service) {
        super();
    }
}