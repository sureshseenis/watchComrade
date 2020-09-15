package com.watch.comrade.di.component;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import com.watch.comrade.app.IsTheApp;
import com.watch.comrade.data.rxFirebase.InterfaceFirebase;
import com.watch.comrade.di.module.AppModule;
import com.watch.comrade.di.module.AppModule_ProvideContextFactory;
import com.watch.comrade.di.module.FirebaseModule;
import com.watch.comrade.di.module.FirebaseModule_ProvideDatabaseReferenceFactory;
import com.watch.comrade.di.module.FirebaseModule_ProvideFirebaseAuthFactory;
import com.watch.comrade.di.module.FirebaseModule_ProvideFirebaseDatabaseFactory;
import com.watch.comrade.di.module.FirebaseModule_ProvideFirebaseStorageFactory;
import com.watch.comrade.di.module.FirebaseModule_ProvideInterfaceFirebaseFactory;
import com.watch.comrade.di.module.FirebaseModule_ProvideStorageReferenceFactory;
import com.watch.comrade.services.accessibilityData.AccessibilityDataService;
import com.watch.comrade.services.accessibilityData.AccessibilityDataService_MembersInjector;
import com.watch.comrade.services.accessibilityData.InteractorAccessibilityData;
import com.watch.comrade.services.notificationService.InteractorNotificationService;
import com.watch.comrade.services.notificationService.NotificationService;
import com.watch.comrade.services.notificationService.NotificationService_MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private FirebaseModule firebaseModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private InteractorAccessibilityData getInteractorAccessibilityData() {
    return new InteractorAccessibilityData(
        AppModule_ProvideContextFactory.proxyProvideContext(appModule), getInterfaceFirebase());
  }

  private InteractorNotificationService getInteractorNotificationService() {
    return new InteractorNotificationService(
        AppModule_ProvideContextFactory.proxyProvideContext(appModule), getInterfaceFirebase());
  }

  private DatabaseReference getDatabaseReference() {
    return FirebaseModule_ProvideDatabaseReferenceFactory.proxyProvideDatabaseReference(
        firebaseModule,
        FirebaseModule_ProvideFirebaseDatabaseFactory.proxyProvideFirebaseDatabase(firebaseModule));
  }

  private StorageReference getStorageReference() {
    return FirebaseModule_ProvideStorageReferenceFactory.proxyProvideStorageReference(
        firebaseModule,
        FirebaseModule_ProvideFirebaseStorageFactory.proxyProvideFirebaseStorage(firebaseModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
    this.firebaseModule = builder.firebaseModule;
  }

  @Override
  public void inject(IsTheApp app) {}

  @Override
  public void inject(AccessibilityDataService accessibilityDataService) {
    injectAccessibilityDataService(accessibilityDataService);
  }

  @Override
  public void inject(NotificationService notificationService) {
    injectNotificationService(notificationService);
  }

  @Override
  public InterfaceFirebase getInterfaceFirebase() {
    return FirebaseModule_ProvideInterfaceFirebaseFactory.proxyProvideInterfaceFirebase(
        firebaseModule,
        AppModule_ProvideContextFactory.proxyProvideContext(appModule),
        FirebaseModule_ProvideFirebaseAuthFactory.proxyProvideFirebaseAuth(firebaseModule),
        getDatabaseReference(),
        getStorageReference());
  }

  @CanIgnoreReturnValue
  private AccessibilityDataService injectAccessibilityDataService(
      AccessibilityDataService instance) {
    AccessibilityDataService_MembersInjector.injectInteractor(
        instance, getInteractorAccessibilityData());
    return instance;
  }

  @CanIgnoreReturnValue
  private NotificationService injectNotificationService(NotificationService instance) {
    NotificationService_MembersInjector.injectInteractor(
        instance, getInteractorNotificationService());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private FirebaseModule firebaseModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (firebaseModule == null) {
        this.firebaseModule = new FirebaseModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder firebaseModule(FirebaseModule firebaseModule) {
      this.firebaseModule = Preconditions.checkNotNull(firebaseModule);
      return this;
    }
  }
}
