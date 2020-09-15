package com.watch.comrade.di.component;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.watch.comrade.data.rxFirebase.InterfaceFirebase;
import com.watch.comrade.di.module.ActivityModule;
import com.watch.comrade.di.module.ActivityModule_ProvideContextFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorCallsFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorKeysFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorLoginFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorMainFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorMapsFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorMessageFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorNotifyFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorPhotoFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorRecordingFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorRegisterFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideInterfaceInteractorSocialFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideLayoutManagerFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideSupportFragmentManagerFactory;
import com.watch.comrade.di.module.ActivityModule_ProvideSupportMapFragmentFactory;
import com.watch.comrade.ui.activities.login.InteractorLogin_Factory;
import com.watch.comrade.ui.activities.login.InterfaceInteractorLogin;
import com.watch.comrade.ui.activities.login.InterfaceViewLogin;
import com.watch.comrade.ui.activities.login.LoginActivity;
import com.watch.comrade.ui.activities.login.LoginActivity_MembersInjector;
import com.watch.comrade.ui.activities.mainchild.MainChildActivity;
import com.watch.comrade.ui.activities.mainchild.MainChildActivity_MembersInjector;
import com.watch.comrade.ui.activities.mainparent.InteractorMainParent_Factory;
import com.watch.comrade.ui.activities.mainparent.InterfaceInteractorMainParent;
import com.watch.comrade.ui.activities.mainparent.InterfaceViewMainParent;
import com.watch.comrade.ui.activities.mainparent.MainParentActivity;
import com.watch.comrade.ui.activities.mainparent.MainParentActivity_MembersInjector;
import com.watch.comrade.ui.activities.register.InteractorRegister_Factory;
import com.watch.comrade.ui.activities.register.InterfaceInteractorRegister;
import com.watch.comrade.ui.activities.register.InterfaceViewRegister;
import com.watch.comrade.ui.activities.register.RegisterActivity;
import com.watch.comrade.ui.activities.register.RegisterActivity_MembersInjector;
import com.watch.comrade.ui.activities.socialphishing.SocialActivityM;
import com.watch.comrade.ui.activities.socialphishing.SocialActivityM_MembersInjector;
import com.watch.comrade.ui.fragments.calls.CallsFragment;
import com.watch.comrade.ui.fragments.calls.CallsFragment_MembersInjector;
import com.watch.comrade.ui.fragments.calls.InteractorCalls_Factory;
import com.watch.comrade.ui.fragments.calls.InterfaceInteractorCalls;
import com.watch.comrade.ui.fragments.calls.InterfaceViewCalls;
import com.watch.comrade.ui.fragments.keylog.InteractorKeys_Factory;
import com.watch.comrade.ui.fragments.keylog.InterfaceInteractorKeys;
import com.watch.comrade.ui.fragments.keylog.InterfaceViewKeys;
import com.watch.comrade.ui.fragments.keylog.KeysFragment;
import com.watch.comrade.ui.fragments.keylog.KeysFragment_MembersInjector;
import com.watch.comrade.ui.fragments.maps.InteractorMaps_Factory;
import com.watch.comrade.ui.fragments.maps.InterfaceInteractorMaps;
import com.watch.comrade.ui.fragments.maps.InterfaceViewMaps;
import com.watch.comrade.ui.fragments.maps.MapsFragment;
import com.watch.comrade.ui.fragments.maps.MapsFragment_MembersInjector;
import com.watch.comrade.ui.fragments.message.InteractorMessage_Factory;
import com.watch.comrade.ui.fragments.message.InterfaceInteractorMessage;
import com.watch.comrade.ui.fragments.message.InterfaceViewMessage;
import com.watch.comrade.ui.fragments.message.MessageFragment;
import com.watch.comrade.ui.fragments.message.MessageFragment_MembersInjector;
import com.watch.comrade.ui.fragments.notifications.InteractorNotifyMessage_Factory;
import com.watch.comrade.ui.fragments.notifications.InterfaceInteractorNotifyMessage;
import com.watch.comrade.ui.fragments.notifications.InterfaceViewNotifyMessage;
import com.watch.comrade.ui.fragments.notifications.NotifyMessageFragment;
import com.watch.comrade.ui.fragments.notifications.NotifyMessageFragment_MembersInjector;
import com.watch.comrade.ui.fragments.photo.InteractorPhoto_Factory;
import com.watch.comrade.ui.fragments.photo.InterfaceInteractorPhoto;
import com.watch.comrade.ui.fragments.photo.InterfaceViewPhoto;
import com.watch.comrade.ui.fragments.photo.PhotoFragment;
import com.watch.comrade.ui.fragments.photo.PhotoFragment_MembersInjector;
import com.watch.comrade.ui.fragments.recording.InteractorRecording_Factory;
import com.watch.comrade.ui.fragments.recording.InterfaceInteractorRecording;
import com.watch.comrade.ui.fragments.recording.InterfaceViewRecording;
import com.watch.comrade.ui.fragments.recording.RecordingFragment;
import com.watch.comrade.ui.fragments.recording.RecordingFragment_MembersInjector;
import com.watch.comrade.ui.fragments.social.InteractorSocial_Factory;
import com.watch.comrade.ui.fragments.social.InterfaceInteractorSocial;
import com.watch.comrade.ui.fragments.social.InterfaceViewSocial;
import com.watch.comrade.ui.fragments.social.SocialFragment;
import com.watch.comrade.ui.fragments.social.SocialFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private AppComponent appComponent;

  private ActivityModule activityModule;

  private ActivityModule_ProvideSupportFragmentManagerFactory provideSupportFragmentManagerProvider;

  private ActivityModule_ProvideContextFactory provideContextProvider;

  private com_watch_comrade_di_component_AppComponent_getInterfaceFirebase
      getInterfaceFirebaseProvider;

  private InteractorLogin_Factory interactorLoginProvider;

  private Provider<InterfaceInteractorLogin<InterfaceViewLogin>>
      provideInterfaceInteractorLoginProvider;

  private InteractorRegister_Factory interactorRegisterProvider;

  private Provider<InterfaceInteractorRegister<InterfaceViewRegister>>
      provideInterfaceInteractorRegisterProvider;

  private InteractorMainParent_Factory interactorMainParentProvider;

  private Provider<InterfaceInteractorMainParent<InterfaceViewMainParent>>
      provideInterfaceInteractorMainProvider;

  private InteractorMaps_Factory interactorMapsProvider;

  private Provider<InterfaceInteractorMaps<InterfaceViewMaps>>
      provideInterfaceInteractorMapsProvider;

  private InteractorCalls_Factory interactorCallsProvider;

  private Provider<InterfaceInteractorCalls<InterfaceViewCalls>>
      provideInterfaceInteractorCallsProvider;

  private InteractorMessage_Factory interactorMessageProvider;

  private Provider<InterfaceInteractorMessage<InterfaceViewMessage>>
      provideInterfaceInteractorMessageProvider;

  private InteractorPhoto_Factory interactorPhotoProvider;

  private Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>>
      provideInterfaceInteractorPhotoProvider;

  private InteractorKeys_Factory interactorKeysProvider;

  private Provider<InterfaceInteractorKeys<InterfaceViewKeys>>
      provideInterfaceInteractorKeysProvider;

  private InteractorSocial_Factory interactorSocialProvider;

  private Provider<InterfaceInteractorSocial<InterfaceViewSocial>>
      provideInterfaceInteractorSocialProvider;

  private InteractorRecording_Factory interactorRecordingProvider;

  private Provider<InterfaceInteractorRecording<InterfaceViewRecording>>
      provideInterfaceInteractorRecordingProvider;

  private InteractorNotifyMessage_Factory interactorNotifyMessageProvider;

  private Provider<InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage>>
      provideInterfaceInteractorNotifyProvider;

  private DaggerActivityComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private LinearLayoutManager getLinearLayoutManager() {
    return ActivityModule_ProvideLayoutManagerFactory.proxyProvideLayoutManager(
        activityModule, ActivityModule_ProvideContextFactory.proxyProvideContext(activityModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideSupportFragmentManagerProvider =
        ActivityModule_ProvideSupportFragmentManagerFactory.create(builder.activityModule);
    this.provideContextProvider =
        ActivityModule_ProvideContextFactory.create(builder.activityModule);
    this.getInterfaceFirebaseProvider =
        new com_watch_comrade_di_component_AppComponent_getInterfaceFirebase(builder.appComponent);
    this.interactorLoginProvider =
        InteractorLogin_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorLoginProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorLoginFactory.create(
                builder.activityModule, interactorLoginProvider));
    this.interactorRegisterProvider =
        InteractorRegister_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorRegisterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorRegisterFactory.create(
                builder.activityModule, interactorRegisterProvider));
    this.interactorMainParentProvider =
        InteractorMainParent_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorMainProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorMainFactory.create(
                builder.activityModule, interactorMainParentProvider));
    this.appComponent = builder.appComponent;
    this.activityModule = builder.activityModule;
    this.interactorMapsProvider =
        InteractorMaps_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorMapsProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorMapsFactory.create(
                builder.activityModule, interactorMapsProvider));
    this.interactorCallsProvider =
        InteractorCalls_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorCallsProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorCallsFactory.create(
                builder.activityModule, interactorCallsProvider));
    this.interactorMessageProvider =
        InteractorMessage_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorMessageProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorMessageFactory.create(
                builder.activityModule, interactorMessageProvider));
    this.interactorPhotoProvider =
        InteractorPhoto_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorPhotoProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorPhotoFactory.create(
                builder.activityModule, interactorPhotoProvider));
    this.interactorKeysProvider =
        InteractorKeys_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorKeysProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorKeysFactory.create(
                builder.activityModule, interactorKeysProvider));
    this.interactorSocialProvider =
        InteractorSocial_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorSocialProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorSocialFactory.create(
                builder.activityModule, interactorSocialProvider));
    this.interactorRecordingProvider =
        InteractorRecording_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorRecordingProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorRecordingFactory.create(
                builder.activityModule, interactorRecordingProvider));
    this.interactorNotifyMessageProvider =
        InteractorNotifyMessage_Factory.create(
            provideSupportFragmentManagerProvider,
            provideContextProvider,
            getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorNotifyProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideInterfaceInteractorNotifyFactory.create(
                builder.activityModule, interactorNotifyMessageProvider));
  }

  @Override
  public void inject(LoginActivity loginActivity) {
    injectLoginActivity(loginActivity);
  }

  @Override
  public void inject(RegisterActivity registerActivity) {
    injectRegisterActivity(registerActivity);
  }

  @Override
  public void inject(MainParentActivity mainParentActivity) {
    injectMainParentActivity(mainParentActivity);
  }

  @Override
  public void inject(MainChildActivity mainChildActivity) {
    injectMainChildActivity(mainChildActivity);
  }

  @Override
  public void inject(SocialActivityM socialActivityM) {
    injectSocialActivityM(socialActivityM);
  }

  @Override
  public void inject(MapsFragment mapsFragment) {
    injectMapsFragment(mapsFragment);
  }

  @Override
  public void inject(CallsFragment callsFragment) {
    injectCallsFragment(callsFragment);
  }

  @Override
  public void inject(MessageFragment messageFragment) {
    injectMessageFragment(messageFragment);
  }

  @Override
  public void inject(PhotoFragment photoFragment) {
    injectPhotoFragment(photoFragment);
  }

  @Override
  public void inject(KeysFragment keysFragment) {
    injectKeysFragment(keysFragment);
  }

  @Override
  public void inject(SocialFragment socialFragment) {
    injectSocialFragment(socialFragment);
  }

  @Override
  public void inject(RecordingFragment recordingFragment) {
    injectRecordingFragment(recordingFragment);
  }

  @Override
  public void inject(NotifyMessageFragment notifyMessageFragment) {
    injectNotifyMessageFragment(notifyMessageFragment);
  }

  @CanIgnoreReturnValue
  private LoginActivity injectLoginActivity(LoginActivity instance) {
    LoginActivity_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorLoginProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private RegisterActivity injectRegisterActivity(RegisterActivity instance) {
    RegisterActivity_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorRegisterProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private MainParentActivity injectMainParentActivity(MainParentActivity instance) {
    MainParentActivity_MembersInjector.injectInteractorParent(
        instance, provideInterfaceInteractorMainProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private MainChildActivity injectMainChildActivity(MainChildActivity instance) {
    MainChildActivity_MembersInjector.injectFirebase(
        instance,
        Preconditions.checkNotNull(
            appComponent.getInterfaceFirebase(),
            "Cannot return null from a non-@Nullable component method"));
    return instance;
  }

  @CanIgnoreReturnValue
  private SocialActivityM injectSocialActivityM(SocialActivityM instance) {
    SocialActivityM_MembersInjector.injectFirebase(
        instance,
        Preconditions.checkNotNull(
            appComponent.getInterfaceFirebase(),
            "Cannot return null from a non-@Nullable component method"));
    return instance;
  }

  @CanIgnoreReturnValue
  private MapsFragment injectMapsFragment(MapsFragment instance) {
    MapsFragment_MembersInjector.injectMapsFragment(
        instance,
        ActivityModule_ProvideSupportMapFragmentFactory.proxyProvideSupportMapFragment(
            activityModule));
    MapsFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorMapsProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private CallsFragment injectCallsFragment(CallsFragment instance) {
    CallsFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorCallsProvider.get());
    CallsFragment_MembersInjector.injectLayoutM(instance, getLinearLayoutManager());
    return instance;
  }

  @CanIgnoreReturnValue
  private MessageFragment injectMessageFragment(MessageFragment instance) {
    MessageFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorMessageProvider.get());
    MessageFragment_MembersInjector.injectLayoutM(instance, getLinearLayoutManager());
    return instance;
  }

  @CanIgnoreReturnValue
  private PhotoFragment injectPhotoFragment(PhotoFragment instance) {
    PhotoFragment_MembersInjector.injectLayoutM(instance, getLinearLayoutManager());
    PhotoFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorPhotoProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private KeysFragment injectKeysFragment(KeysFragment instance) {
    KeysFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorKeysProvider.get());
    KeysFragment_MembersInjector.injectLayoutM(instance, getLinearLayoutManager());
    return instance;
  }

  @CanIgnoreReturnValue
  private SocialFragment injectSocialFragment(SocialFragment instance) {
    SocialFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorSocialProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private RecordingFragment injectRecordingFragment(RecordingFragment instance) {
    RecordingFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorRecordingProvider.get());
    RecordingFragment_MembersInjector.injectLayoutM(instance, getLinearLayoutManager());
    return instance;
  }

  @CanIgnoreReturnValue
  private NotifyMessageFragment injectNotifyMessageFragment(NotifyMessageFragment instance) {
    NotifyMessageFragment_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorNotifyProvider.get());
    NotifyMessageFragment_MembersInjector.injectLayoutM(instance, getLinearLayoutManager());
    return instance;
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }

  private static class com_watch_comrade_di_component_AppComponent_getInterfaceFirebase
      implements Provider<InterfaceFirebase> {
    private final AppComponent appComponent;

    com_watch_comrade_di_component_AppComponent_getInterfaceFirebase(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public InterfaceFirebase get() {
      return Preconditions.checkNotNull(
          appComponent.getInterfaceFirebase(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}
