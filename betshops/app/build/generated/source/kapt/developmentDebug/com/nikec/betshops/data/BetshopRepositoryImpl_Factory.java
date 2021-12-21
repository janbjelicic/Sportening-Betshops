package com.nikec.betshops.data;

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
public final class BetshopRepositoryImpl_Factory implements Factory<BetshopRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public BetshopRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public BetshopRepositoryImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static BetshopRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new BetshopRepositoryImpl_Factory(apiServiceProvider);
  }

  public static BetshopRepositoryImpl newInstance(ApiService apiService) {
    return new BetshopRepositoryImpl(apiService);
  }
}
