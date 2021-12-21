package com.nikec.betshops.di;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationModule_ProvideFusedLocationClientFactory implements Factory<FusedLocationProviderClient> {
  private final LocationModule module;

  private final Provider<Context> contextProvider;

  public LocationModule_ProvideFusedLocationClientFactory(LocationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public FusedLocationProviderClient get() {
    return provideFusedLocationClient(module, contextProvider.get());
  }

  public static LocationModule_ProvideFusedLocationClientFactory create(LocationModule module,
      Provider<Context> contextProvider) {
    return new LocationModule_ProvideFusedLocationClientFactory(module, contextProvider);
  }

  public static FusedLocationProviderClient provideFusedLocationClient(LocationModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideFusedLocationClient(context));
  }
}
