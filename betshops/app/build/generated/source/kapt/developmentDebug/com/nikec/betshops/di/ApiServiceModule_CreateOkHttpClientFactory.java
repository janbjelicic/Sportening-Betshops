package com.nikec.betshops.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiServiceModule_CreateOkHttpClientFactory implements Factory<OkHttpClient> {
  private final ApiServiceModule module;

  public ApiServiceModule_CreateOkHttpClientFactory(ApiServiceModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return createOkHttpClient(module);
  }

  public static ApiServiceModule_CreateOkHttpClientFactory create(ApiServiceModule module) {
    return new ApiServiceModule_CreateOkHttpClientFactory(module);
  }

  public static OkHttpClient createOkHttpClient(ApiServiceModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.createOkHttpClient());
  }
}
