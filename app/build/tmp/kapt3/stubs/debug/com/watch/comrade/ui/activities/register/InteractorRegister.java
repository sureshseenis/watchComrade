package com.watch.comrade.ui.activities.register;

import java.lang.System;

/**
 * Created by luis rafael on 10/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/watch/comrade/ui/activities/register/InteractorRegister;", "V", "Lcom/watch/comrade/ui/activities/register/InterfaceViewRegister;", "Lcom/watch/comrade/ui/activities/base/BaseInteractor;", "Lcom/watch/comrade/ui/activities/register/InterfaceInteractorRegister;", "supportFragment", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "firebase", "Lcom/watch/comrade/data/rxFirebase/InterfaceFirebase;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lcom/watch/comrade/data/rxFirebase/InterfaceFirebase;)V", "signUpDisposable", "", "email", "", "pass", "app_debug"})
public final class InteractorRegister<V extends com.watch.comrade.ui.activities.register.InterfaceViewRegister> extends com.watch.comrade.ui.activities.base.BaseInteractor<V> implements com.watch.comrade.ui.activities.register.InterfaceInteractorRegister<V> {
    
    @java.lang.Override()
    public void signUpDisposable(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
    }
    
    @javax.inject.Inject()
    public InteractorRegister(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.watch.comrade.data.rxFirebase.InterfaceFirebase firebase) {
        super(null, null, null);
    }
}