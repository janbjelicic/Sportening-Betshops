package com.nikec.betshops.di;

import com.nikec.betshops.data.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class ApiServiceModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final ApiServiceModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiServiceModule_ProvideApiServiceFactory(ApiServiceModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(module, retrofitProvider.get());
  }

  public static ApiServiceModule_ProvideApiServiceFactory create(ApiServiceModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApiServiceModule_ProvideApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService provideApiService(ApiServiceModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiService(retrofit));
  }
}
