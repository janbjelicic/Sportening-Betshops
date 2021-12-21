package com.nikec.betshops.util;

import androidx.fragment.app.FragmentActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class LocationPermissionHelper_Factory implements Factory<LocationPermissionHelper> {
  private final Provider<FragmentActivity> activityProvider;

  public LocationPermissionHelper_Factory(Provider<FragmentActivity> activityProvider) {
    this.activityProvider = activityProvider;
  }

  @Override
  public LocationPermissionHelper get() {
    return newInstance(activityProvider.get());
  }

  public static LocationPermissionHelper_Factory create(
      Provider<FragmentActivity> activityProvider) {
    return new LocationPermissionHelper_Factory(activityProvider);
  }

  public static LocationPermissionHelper newInstance(FragmentActivity activity) {
    return new LocationPermissionHelper(activity);
  }
}
