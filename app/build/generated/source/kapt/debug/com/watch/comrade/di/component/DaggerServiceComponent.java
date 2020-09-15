package com.watch.comrade.di.component;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.watch.comrade.data.rxFirebase.InterfaceFirebase;
import com.watch.comrade.di.module.ServiceModule;
import com.watch.comrade.di.module.ServiceModule_ProvideContextFactory;
import com.watch.comrade.di.module.ServiceModule_ProvideInterfaceInteractorCallsFactory;
import com.watch.comrade.di.module.ServiceModule_ProvideInterfaceInteractorSmsFactory;
import com.watch.comrade.services.calls.CallsService;
import com.watch.comrade.services.calls.CallsService_MembersInjector;
import com.watch.comrade.services.calls.InteractorCalls_Factory;
import com.watch.comrade.services.calls.InterfaceInteractorCalls;
import com.watch.comrade.services.calls.InterfaceServiceCalls;
import com.watch.comrade.services.sms.InteractorSms_Factory;
import com.watch.comrade.services.sms.InterfaceInteractorSms;
import com.watch.comrade.services.sms.InterfaceServiceSms;
import com.watch.comrade.services.sms.SmsService;
import com.watch.comrade.services.sms.SmsService_MembersInjector;
import com.watch.comrade.services.social.InteractorMonitorService;
import com.watch.comrade.services.social.MonitorService;
import com.watch.comrade.services.social.MonitorService_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerServiceComponent implements ServiceComponent {
  private ServiceModule serviceModule;

  private AppComponent appComponent;

  private ServiceModule_ProvideContextFactory provideContextProvider;

  private com_watch_comrade_di_component_AppComponent_getInterfaceFirebase
      getInterfaceFirebaseProvider;

  private InteractorCalls_Factory interactorCallsProvider;

  private Provider<InterfaceInteractorCalls<InterfaceServiceCalls>>
      provideInterfaceInteractorCallsProvider;

  private InteractorSms_Factory interactorSmsProvider;

  private Provider<InterfaceInteractorSms<InterfaceServiceSms>>
      provideInterfaceInteractorSmsProvider;

  private DaggerServiceComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private InteractorMonitorService getInteractorMonitorService() {
    return new InteractorMonitorService(
        ServiceModule_ProvideContextFactory.proxyProvideContext(serviceModule),
        Preconditions.checkNotNull(
            appComponent.getInterfaceFirebase(),
            "Cannot return null from a non-@Nullable component method"));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideContextProvider = ServiceModule_ProvideContextFactory.create(builder.serviceModule);
    this.getInterfaceFirebaseProvider =
        new com_watch_comrade_di_component_AppComponent_getInterfaceFirebase(builder.appComponent);
    this.interactorCallsProvider =
        InteractorCalls_Factory.create(provideContextProvider, getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorCallsProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideInterfaceInteractorCallsFactory.create(
                builder.serviceModule, interactorCallsProvider));
    this.interactorSmsProvider =
        InteractorSms_Factory.create(provideContextProvider, getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorSmsProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideInterfaceInteractorSmsFactory.create(
                builder.serviceModule, interactorSmsProvider));
    this.serviceModule = builder.serviceModule;
    this.appComponent = builder.appComponent;
  }

  @Override
  public void inject(CallsService callsService) {
    injectCallsService(callsService);
  }

  @Override
  public void inject(SmsService smsService) {
    injectSmsService(smsService);
  }

  @Override
  public void inject(MonitorService monitorService) {
    injectMonitorService(monitorService);
  }

  @CanIgnoreReturnValue
  private CallsService injectCallsService(CallsService instance) {
    CallsService_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorCallsProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private SmsService injectSmsService(SmsService instance) {
    SmsService_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorSmsProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private MonitorService injectMonitorService(MonitorService instance) {
    MonitorService_MembersInjector.injectInteractor(instance, getInteractorMonitorService());
    return instance;
  }

  public static final class Builder {
    private ServiceModule serviceModule;

    private AppComponent appComponent;

    private Builder() {}

    public ServiceComponent build() {
      if (serviceModule == null) {
        throw new IllegalStateException(ServiceModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerServiceComponent(this);
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
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
