package com.watch.comrade.ui.fragments.calls;

import java.lang.System;

/**
 * Created by luis rafael on 12/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/watch/comrade/ui/fragments/calls/InterfaceInteractorCalls;", "V", "Lcom/watch/comrade/ui/fragments/calls/InterfaceViewCalls;", "Lcom/watch/comrade/ui/activities/base/InterfaceInteractor;", "stopAudioCallHolder", "", "app_debug"})
@com.watch.comrade.di.PerActivity()
public abstract interface InterfaceInteractorCalls<V extends com.watch.comrade.ui.fragments.calls.InterfaceViewCalls> extends com.watch.comrade.ui.activities.base.InterfaceInteractor<V> {
    
    public abstract void stopAudioCallHolder();
}