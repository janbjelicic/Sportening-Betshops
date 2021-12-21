package com.nikec.betshops.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiServiceModule_CreateRetrofitFactory implements Factory<Retrofit> {
  private final ApiServiceModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public ApiServiceModule_CreateRetrofitFactory(ApiServiceModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return createRetrofit(module, okHttpClientProvider.get());
  }

  public static ApiServiceModule_CreateRetrofitFactory create(ApiServiceModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new ApiServiceModule_CreateRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit createRetrofit(ApiServiceModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.createRetrofit(okHttpClient));
  }
}
