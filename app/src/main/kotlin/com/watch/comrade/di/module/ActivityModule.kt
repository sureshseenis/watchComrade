package com.watch.comrade.di.module

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.watch.comrade.di.PerActivity
import com.watch.comrade.ui.activities.login.InteractorLogin
import com.watch.comrade.ui.activities.login.InterfaceInteractorLogin
import com.watch.comrade.ui.activities.login.InterfaceViewLogin
import com.watch.comrade.ui.activities.mainparent.InteractorMainParent
import com.watch.comrade.ui.activities.mainparent.InterfaceInteractorMainParent
import com.watch.comrade.ui.activities.mainparent.InterfaceViewMainParent
import com.watch.comrade.ui.activities.register.InteractorRegister
import com.watch.comrade.ui.activities.register.InterfaceInteractorRegister
import com.watch.comrade.ui.activities.register.InterfaceViewRegister
import com.watch.comrade.ui.fragments.calls.InteractorCalls
import com.watch.comrade.ui.fragments.calls.InterfaceInteractorCalls
import com.watch.comrade.ui.fragments.calls.InterfaceViewCalls
import com.watch.comrade.ui.fragments.photo.InteractorPhoto
import com.watch.comrade.ui.fragments.photo.InterfaceInteractorPhoto
import com.watch.comrade.ui.fragments.photo.InterfaceViewPhoto
import com.watch.comrade.ui.fragments.keylog.InteractorKeys
import com.watch.comrade.ui.fragments.keylog.InterfaceInteractorKeys
import com.watch.comrade.ui.fragments.keylog.InterfaceViewKeys
import com.watch.comrade.ui.fragments.maps.InteractorMaps
import com.watch.comrade.ui.fragments.maps.InterfaceInteractorMaps
import com.watch.comrade.ui.fragments.maps.InterfaceViewMaps
import com.watch.comrade.ui.fragments.message.InteractorMessage
import com.watch.comrade.ui.fragments.message.InterfaceInteractorMessage
import com.watch.comrade.ui.fragments.message.InterfaceViewMessage
import com.watch.comrade.ui.fragments.notifications.InteractorNotifyMessage
import com.watch.comrade.ui.fragments.notifications.InterfaceInteractorNotifyMessage
import com.watch.comrade.ui.fragments.notifications.InterfaceViewNotifyMessage
import com.watch.comrade.ui.fragments.recording.InteractorRecording
import com.watch.comrade.ui.fragments.recording.InterfaceInteractorRecording
import com.watch.comrade.ui.fragments.recording.InterfaceViewRecording
import com.watch.comrade.ui.fragments.social.InteractorSocial
import com.watch.comrade.ui.fragments.social.InterfaceInteractorSocial
import com.watch.comrade.ui.fragments.social.InterfaceViewSocial
import com.google.android.gms.maps.SupportMapFragment
import dagger.Module
import dagger.Provides

/**
 * Created by luis rafael on 8/03/18.
 */
@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideContext(): Context = activity.applicationContext

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideSupportFragmentManager(): FragmentManager = activity.supportFragmentManager

    @Provides
    fun provideSupportMapFragment(): SupportMapFragment = SupportMapFragment.newInstance()

    @Provides
    fun provideLayoutManager(context: Context): LinearLayoutManager = LinearLayoutManager(context)

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMain(interactorParent: InteractorMainParent<InterfaceViewMainParent>): InterfaceInteractorMainParent<InterfaceViewMainParent> = interactorParent

    @Provides
    @PerActivity
    fun provideInterfaceInteractorLogin(interactor: InteractorLogin<InterfaceViewLogin>): InterfaceInteractorLogin<InterfaceViewLogin> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRegister(interactor: InteractorRegister<InterfaceViewRegister>): InterfaceInteractorRegister<InterfaceViewRegister> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMaps(interactor: InteractorMaps<InterfaceViewMaps>): InterfaceInteractorMaps<InterfaceViewMaps> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceViewCalls>): InterfaceInteractorCalls<InterfaceViewCalls> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorKeys(interactor: InteractorKeys<InterfaceViewKeys>): InterfaceInteractorKeys<InterfaceViewKeys> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMessage(interactor: InteractorMessage<InterfaceViewMessage>): InterfaceInteractorMessage<InterfaceViewMessage> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorPhoto(interactor: InteractorPhoto<InterfaceViewPhoto>): InterfaceInteractorPhoto<InterfaceViewPhoto> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorSocial(interactor: InteractorSocial<InterfaceViewSocial>): InterfaceInteractorSocial<InterfaceViewSocial> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRecording(interactor: InteractorRecording<InterfaceViewRecording>): InterfaceInteractorRecording<InterfaceViewRecording> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorNotify(interactor: InteractorNotifyMessage<InterfaceViewNotifyMessage>): InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> = interactor


}