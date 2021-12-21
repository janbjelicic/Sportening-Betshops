package com.nikec.betshops.ui;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.nikec.betshops.util.LocationPermissionHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class BetshopsActivity_MembersInjector implements MembersInjector<BetshopsActivity> {
  private final Provider<LocationPermissionHelper> locationPermissionHelperProvider;

  private final Provider<FusedLocationProviderClient> fusedLocationClientProvider;

  public BetshopsActivity_MembersInjector(
      Provider<LocationPermissionHelper> locationPermissionHelperProvider,
      Provider<FusedLocationProviderClient> fusedLocationClientProvider) {
    this.locationPermissionHelperProvider = locationPermissionHelperProvider;
    this.fusedLocationClientProvider = fusedLocationClientProvider;
  }

  public static MembersInjector<BetshopsActivity> create(
      Provider<LocationPermissionHelper> locationPermissionHelperProvider,
      Provider<FusedLocationProviderClient> fusedLocationClientProvider) {
    return new BetshopsActivity_MembersInjector(locationPermissionHelperProvider, fusedLocationClientProvider);
  }

  @Override
  public void injectMembers(BetshopsActivity instance) {
    injectLocationPermissionHelper(instance, locationPermissionHelperProvider.get());
    injectFusedLocationClient(instance, fusedLocationClientProvider.get());
  }

  @InjectedFieldSignature("com.nikec.betshops.ui.BetshopsActivity.locationPermissionHelper")
  public static void injectLocationPermissionHelper(BetshopsActivity instance,
      LocationPermissionHelper locationPermissionHelper) {
    instance.locationPermissionHelper = locationPermissionHelper;
  }

  @InjectedFieldSignature("com.nikec.betshops.ui.BetshopsActivity.fusedLocationClient")
  public static void injectFusedLocationClient(BetshopsActivity instance,
      FusedLocationProviderClient fusedLocationClient) {
    instance.fusedLocationClient = fusedLocationClient;
  }
}
