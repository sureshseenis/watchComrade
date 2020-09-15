package com.watch.comrade.di.component;

import java.lang.System;

/**
 * Created by luis rafael on 13/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/watch/comrade/di/component/ServiceComponent;", "", "inject", "", "callsService", "Lcom/watch/comrade/services/calls/CallsService;", "smsService", "Lcom/watch/comrade/services/sms/SmsService;", "monitorService", "Lcom/watch/comrade/services/social/MonitorService;", "app_debug"})
@dagger.Component(dependencies = {com.watch.comrade.di.component.AppComponent.class}, modules = {com.watch.comrade.di.module.ServiceModule.class})
@com.watch.comrade.di.PerService()
public abstract interface ServiceComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.services.calls.CallsService callsService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.services.sms.SmsService smsService);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.services.social.MonitorService monitorService);
}