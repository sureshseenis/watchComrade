package com.watch.comrade.di.component;

import java.lang.System;

/**
 * Created by luis rafael on 8/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&\u00a8\u0006\u001e"}, d2 = {"Lcom/watch/comrade/di/component/ActivityComponent;", "", "inject", "", "loginActivity", "Lcom/watch/comrade/ui/activities/login/LoginActivity;", "mainChildActivity", "Lcom/watch/comrade/ui/activities/mainchild/MainChildActivity;", "mainParentActivity", "Lcom/watch/comrade/ui/activities/mainparent/MainParentActivity;", "registerActivity", "Lcom/watch/comrade/ui/activities/register/RegisterActivity;", "socialActivityM", "Lcom/watch/comrade/ui/activities/socialphishing/SocialActivityM;", "callsFragment", "Lcom/watch/comrade/ui/fragments/calls/CallsFragment;", "keysFragment", "Lcom/watch/comrade/ui/fragments/keylog/KeysFragment;", "mapsFragment", "Lcom/watch/comrade/ui/fragments/maps/MapsFragment;", "messageFragment", "Lcom/watch/comrade/ui/fragments/message/MessageFragment;", "notifyMessageFragment", "Lcom/watch/comrade/ui/fragments/notifications/NotifyMessageFragment;", "photoFragment", "Lcom/watch/comrade/ui/fragments/photo/PhotoFragment;", "recordingFragment", "Lcom/watch/comrade/ui/fragments/recording/RecordingFragment;", "socialFragment", "Lcom/watch/comrade/ui/fragments/social/SocialFragment;", "app_debug"})
@dagger.Component(dependencies = {com.watch.comrade.di.component.AppComponent.class}, modules = {com.watch.comrade.di.module.ActivityModule.class})
@com.watch.comrade.di.PerActivity()
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.login.LoginActivity loginActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.register.RegisterActivity registerActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.mainparent.MainParentActivity mainParentActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.mainchild.MainChildActivity mainChildActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.activities.socialphishing.SocialActivityM socialActivityM);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.maps.MapsFragment mapsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.calls.CallsFragment callsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.message.MessageFragment messageFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.photo.PhotoFragment photoFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.keylog.KeysFragment keysFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.social.SocialFragment socialFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.recording.RecordingFragment recordingFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.notifications.NotifyMessageFragment notifyMessageFragment);
}