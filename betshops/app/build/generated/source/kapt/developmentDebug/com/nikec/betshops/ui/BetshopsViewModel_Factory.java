package com.nikec.betshops.ui;

import com.nikec.betshops.data.BetshopRepository;
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
public final class BetshopsViewModel_Factory implements Factory<BetshopsViewModel> {
  private final Provider<BetshopRepository> betshopRepositoryProvider;

  public BetshopsViewModel_Factory(Provider<BetshopRepository> betshopRepositoryProvider) {
    this.betshopRepositoryProvider = betshopRepositoryProvider;
  }

  @Override
  public BetshopsViewModel get() {
    return newInstance(betshopRepositoryProvider.get());
  }

  public static BetshopsViewModel_Factory create(
      Provider<BetshopRepository> betshopRepositoryProvider) {
    return new BetshopsViewModel_Factory(betshopRepositoryProvider);
  }

  public static BetshopsViewModel newInstance(BetshopRepository betshopRepository) {
    return new BetshopsViewModel(betshopRepository);
  }
}
