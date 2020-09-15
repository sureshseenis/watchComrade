package com.watch.comrade.ui.fragments.notifications;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.watch.comrade.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorNotifyMessage_Factory<V extends InterfaceViewNotifyMessage>
    implements Factory<InteractorNotifyMessage<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorNotifyMessage_Factory(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorNotifyMessage<V> get() {
    return new InteractorNotifyMessage<V>(
        supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewNotifyMessage> InteractorNotifyMessage_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorNotifyMessage_Factory<V>(
        supportFragmentProvider, contextProvider, firebaseProvider);
  }
}
