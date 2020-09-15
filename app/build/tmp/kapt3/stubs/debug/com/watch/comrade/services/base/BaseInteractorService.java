package com.watch.comrade.services.base;

import java.lang.System;

/**
 * Created by luis rafael on 22/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/watch/comrade/services/base/BaseInteractorService;", "S", "Lcom/watch/comrade/services/base/InterfaceService;", "Lcom/watch/comrade/services/base/InterfaceInteractorService;", "context", "Landroid/content/Context;", "firebase", "Lcom/watch/comrade/data/rxFirebase/InterfaceFirebase;", "(Landroid/content/Context;Lcom/watch/comrade/data/rxFirebase/InterfaceFirebase;)V", "service", "Lcom/watch/comrade/services/base/InterfaceService;", "getContext", "getService", "()Lcom/watch/comrade/services/base/InterfaceService;", "isNullService", "", "onAttach", "", "(Lcom/watch/comrade/services/base/InterfaceService;)V", "onDetach", "user", "Lcom/google/firebase/auth/FirebaseUser;", "app_debug"})
public class BaseInteractorService<S extends com.watch.comrade.services.base.InterfaceService> implements com.watch.comrade.services.base.InterfaceInteractorService<S> {
    private S service;
    private android.content.Context context;
    private com.watch.comrade.data.rxFirebase.InterfaceFirebase firebase;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    S service) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public S getService() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isNullService() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.watch.comrade.data.rxFirebase.InterfaceFirebase firebase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.firebase.auth.FirebaseUser user() {
        return null;
    }
    
    @javax.inject.Inject()
    public BaseInteractorService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.watch.comrade.data.rxFirebase.InterfaceFirebase firebase) {
        super();
    }
}