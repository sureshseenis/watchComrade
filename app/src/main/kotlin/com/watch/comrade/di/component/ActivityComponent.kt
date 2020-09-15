package com.watch.comrade.di.component

import com.watch.comrade.data.model.NotificationMessages
import com.watch.comrade.di.PerActivity
import com.watch.comrade.di.module.ActivityModule
import com.watch.comrade.ui.activities.mainparent.MainParentActivity
import com.watch.comrade.ui.activities.register.RegisterActivity
import com.watch.comrade.ui.activities.login.LoginActivity
import com.watch.comrade.ui.activities.mainchild.MainChildActivity
import com.watch.comrade.ui.activities.socialphishing.SocialActivityM
import com.watch.comrade.ui.fragments.calls.CallsFragment
import com.watch.comrade.ui.fragments.photo.PhotoFragment
import com.watch.comrade.ui.fragments.keylog.KeysFragment
import com.watch.comrade.ui.fragments.maps.MapsFragment
import com.watch.comrade.ui.fragments.message.MessageFragment
import com.watch.comrade.ui.fragments.notifications.NotifyMessageFragment
import com.watch.comrade.ui.fragments.recording.RecordingFragment
import com.watch.comrade.ui.fragments.social.SocialFragment
import dagger.Component

/**
 * Created by luis rafael on 8/03/18.
 */
@PerActivity
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(mainParentActivity: MainParentActivity)
    fun inject(mainChildActivity: MainChildActivity)
    fun inject(socialActivityM: SocialActivityM)
    fun inject(mapsFragment: MapsFragment)
    fun inject(callsFragment: CallsFragment)
    fun inject(messageFragment: MessageFragment)
    fun inject(photoFragment: PhotoFragment)
    fun inject(keysFragment: KeysFragment)
    fun inject(socialFragment: SocialFragment)
    fun inject(recordingFragment: RecordingFragment)
    fun inject(notifyMessageFragment: NotifyMessageFragment)

}