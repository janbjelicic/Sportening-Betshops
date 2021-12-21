package com.nikec.betshops.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BetshopsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static BetshopsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(BetshopsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final BetshopsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new BetshopsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
