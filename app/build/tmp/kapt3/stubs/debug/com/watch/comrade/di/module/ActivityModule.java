package com.watch.comrade.di.module;

import java.lang.System;

/**
 * Created by luis rafael on 8/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0007J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010H\u0007J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0014H\u0007J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0007J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001dH\u0007J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020 0!H\u0007J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020$0%H\u0007J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020(0)H\u0007J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020,0-H\u0007J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020001H\u0007J\u001c\u00102\u001a\b\u0012\u0004\u0012\u000204032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020405H\u0007J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0007H\u0007J\b\u00109\u001a\u00020:H\u0007J\b\u0010;\u001a\u00020<H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/watch/comrade/di/module/ActivityModule;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "provideActivity", "provideContext", "Landroid/content/Context;", "provideInterfaceInteractorCalls", "Lcom/watch/comrade/ui/fragments/calls/InterfaceInteractorCalls;", "Lcom/watch/comrade/ui/fragments/calls/InterfaceViewCalls;", "interactor", "Lcom/watch/comrade/ui/fragments/calls/InteractorCalls;", "provideInterfaceInteractorKeys", "Lcom/watch/comrade/ui/fragments/keylog/InterfaceInteractorKeys;", "Lcom/watch/comrade/ui/fragments/keylog/InterfaceViewKeys;", "Lcom/watch/comrade/ui/fragments/keylog/InteractorKeys;", "provideInterfaceInteractorLogin", "Lcom/watch/comrade/ui/activities/login/InterfaceInteractorLogin;", "Lcom/watch/comrade/ui/activities/login/InterfaceViewLogin;", "Lcom/watch/comrade/ui/activities/login/InteractorLogin;", "provideInterfaceInteractorMain", "Lcom/watch/comrade/ui/activities/mainparent/InterfaceInteractorMainParent;", "Lcom/watch/comrade/ui/activities/mainparent/InterfaceViewMainParent;", "interactorParent", "Lcom/watch/comrade/ui/activities/mainparent/InteractorMainParent;", "provideInterfaceInteractorMaps", "Lcom/watch/comrade/ui/fragments/maps/InterfaceInteractorMaps;", "Lcom/watch/comrade/ui/fragments/maps/InterfaceViewMaps;", "Lcom/watch/comrade/ui/fragments/maps/InteractorMaps;", "provideInterfaceInteractorMessage", "Lcom/watch/comrade/ui/fragments/message/InterfaceInteractorMessage;", "Lcom/watch/comrade/ui/fragments/message/InterfaceViewMessage;", "Lcom/watch/comrade/ui/fragments/message/InteractorMessage;", "provideInterfaceInteractorNotify", "Lcom/watch/comrade/ui/fragments/notifications/InterfaceInteractorNotifyMessage;", "Lcom/watch/comrade/ui/fragments/notifications/InterfaceViewNotifyMessage;", "Lcom/watch/comrade/ui/fragments/notifications/InteractorNotifyMessage;", "provideInterfaceInteractorPhoto", "Lcom/watch/comrade/ui/fragments/photo/InterfaceInteractorPhoto;", "Lcom/watch/comrade/ui/fragments/photo/InterfaceViewPhoto;", "Lcom/watch/comrade/ui/fragments/photo/InteractorPhoto;", "provideInterfaceInteractorRecording", "Lcom/watch/comrade/ui/fragments/recording/InterfaceInteractorRecording;", "Lcom/watch/comrade/ui/fragments/recording/InterfaceViewRecording;", "Lcom/watch/comrade/ui/fragments/recording/InteractorRecording;", "provideInterfaceInteractorRegister", "Lcom/watch/comrade/ui/activities/register/InterfaceInteractorRegister;", "Lcom/watch/comrade/ui/activities/register/InterfaceViewRegister;", "Lcom/watch/comrade/ui/activities/register/InteractorRegister;", "provideInterfaceInteractorSocial", "Lcom/watch/comrade/ui/fragments/social/InterfaceInteractorSocial;", "Lcom/watch/comrade/ui/fragments/social/InterfaceViewSocial;", "Lcom/watch/comrade/ui/fragments/social/InteractorSocial;", "provideLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "provideSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "provideSupportMapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.appcompat.app.AppCompatActivity provideActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.fragment.app.FragmentManager provideSupportFragmentManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.gms.maps.SupportMapFragment provideSupportMapFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.activities.mainparent.InterfaceInteractorMainParent<com.watch.comrade.ui.activities.mainparent.InterfaceViewMainParent> provideInterfaceInteractorMain(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.mainparent.InteractorMainParent<com.watch.comrade.ui.activities.mainparent.InterfaceViewMainParent> interactorParent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.activities.login.InterfaceInteractorLogin<com.watch.comrade.ui.activities.login.InterfaceViewLogin> provideInterfaceInteractorLogin(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.login.InteractorLogin<com.watch.comrade.ui.activities.login.InterfaceViewLogin> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.activities.register.InterfaceInteractorRegister<com.watch.comrade.ui.activities.register.InterfaceViewRegister> provideInterfaceInteractorRegister(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.register.InteractorRegister<com.watch.comrade.ui.activities.register.InterfaceViewRegister> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.maps.InterfaceInteractorMaps<com.watch.comrade.ui.fragments.maps.InterfaceViewMaps> provideInterfaceInteractorMaps(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.maps.InteractorMaps<com.watch.comrade.ui.fragments.maps.InterfaceViewMaps> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.calls.InterfaceInteractorCalls<com.watch.comrade.ui.fragments.calls.InterfaceViewCalls> provideInterfaceInteractorCalls(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.calls.InteractorCalls<com.watch.comrade.ui.fragments.calls.InterfaceViewCalls> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.keylog.InterfaceInteractorKeys<com.watch.comrade.ui.fragments.keylog.InterfaceViewKeys> provideInterfaceInteractorKeys(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.keylog.InteractorKeys<com.watch.comrade.ui.fragments.keylog.InterfaceViewKeys> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.message.InterfaceInteractorMessage<com.watch.comrade.ui.fragments.message.InterfaceViewMessage> provideInterfaceInteractorMessage(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.message.InteractorMessage<com.watch.comrade.ui.fragments.message.InterfaceViewMessage> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.photo.InterfaceInteractorPhoto<com.watch.comrade.ui.fragments.photo.InterfaceViewPhoto> provideInterfaceInteractorPhoto(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.photo.InteractorPhoto<com.watch.comrade.ui.fragments.photo.InterfaceViewPhoto> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.social.InterfaceInteractorSocial<com.watch.comrade.ui.fragments.social.InterfaceViewSocial> provideInterfaceInteractorSocial(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.social.InteractorSocial<com.watch.comrade.ui.fragments.social.InterfaceViewSocial> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.recording.InterfaceInteractorRecording<com.watch.comrade.ui.fragments.recording.InterfaceViewRecording> provideInterfaceInteractorRecording(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.recording.InteractorRecording<com.watch.comrade.ui.fragments.recording.InterfaceViewRecording> interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.watch.comrade.di.PerActivity()
    @dagger.Provides()
    public final com.watch.comrade.ui.fragments.notifications.InterfaceInteractorNotifyMessage<com.watch.comrade.ui.fragments.notifications.InterfaceViewNotifyMessage> provideInterfaceInteractorNotify(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.notifications.InteractorNotifyMessage<com.watch.comrade.ui.fragments.notifications.InterfaceViewNotifyMessage> interactor) {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
}