package com.nikec.betshops;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.nikec.betshops.data.ApiService;
import com.nikec.betshops.data.BetshopRepositoryImpl;
import com.nikec.betshops.di.ApiServiceModule;
import com.nikec.betshops.di.ApiServiceModule_CreateOkHttpClientFactory;
import com.nikec.betshops.di.ApiServiceModule_CreateRetrofitFactory;
import com.nikec.betshops.di.ApiServiceModule_ProvideApiServiceFactory;
import com.nikec.betshops.di.LocationModule;
import com.nikec.betshops.di.LocationModule_ProvideFusedLocationClientFactory;
import com.nikec.betshops.ui.BetshopsActivity;
import com.nikec.betshops.ui.BetshopsActivity_MembersInjector;
import com.nikec.betshops.ui.BetshopsViewModel;
import com.nikec.betshops.ui.BetshopsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.nikec.betshops.util.LocationPermissionHelper;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ActivityModule_ProvideFragmentActivityFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final LocationModule locationModule;

  private final ApplicationContextModule applicationContextModule;

  private final ApiServiceModule apiServiceModule;

  private final DaggerApp_HiltComponents_SingletonC singletonC = this;

  private Provider<FusedLocationProviderClient> provideFusedLocationClientProvider;

  private Provider<OkHttpClient> createOkHttpClientProvider;

  private Provider<Retrofit> createRetrofitProvider;

  private Provider<ApiService> provideApiServiceProvider;

  private DaggerApp_HiltComponents_SingletonC(ApiServiceModule apiServiceModuleParam,
      ApplicationContextModule applicationContextModuleParam, LocationModule locationModuleParam) {
    this.locationModule = locationModuleParam;
    this.applicationContextModule = applicationContextModuleParam;
    this.apiServiceModule = apiServiceModuleParam;
    initialize(apiServiceModuleParam, applicationContextModuleParam, locationModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private FusedLocationProviderClient fusedLocationProviderClient() {
    return LocationModule_ProvideFusedLocationClientFactory.provideFusedLocationClient(locationModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private Retrofit retrofit() {
    return ApiServiceModule_CreateRetrofitFactory.createRetrofit(apiServiceModule, createOkHttpClientProvider.get());
  }

  private ApiService apiService() {
    return ApiServiceModule_ProvideApiServiceFactory.provideApiService(apiServiceModule, createRetrofitProvider.get());
  }

  private BetshopRepositoryImpl betshopRepositoryImpl() {
    return new BetshopRepositoryImpl(provideApiServiceProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApiServiceModule apiServiceModuleParam,
      final ApplicationContextModule applicationContextModuleParam,
      final LocationModule locationModuleParam) {
    this.provideFusedLocationClientProvider = DoubleCheck.provider(new SwitchingProvider<FusedLocationProviderClient>(singletonC, 0));
    this.createOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 3));
    this.createRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonC, 2));
    this.provideApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<ApiService>(singletonC, 1));
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApiServiceModule apiServiceModule;

    private ApplicationContextModule applicationContextModule;

    private LocationModule locationModule;

    private Builder() {
    }

    public Builder apiServiceModule(ApiServiceModule apiServiceModule) {
      this.apiServiceModule = Preconditions.checkNotNull(apiServiceModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder locationModule(LocationModule locationModule) {
      this.locationModule = Preconditions.checkNotNull(locationModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      if (apiServiceModule == null) {
        this.apiServiceModule = new ApiServiceModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (locationModule == null) {
        this.locationModule = new LocationModule();
      }
      return new DaggerApp_HiltComponents_SingletonC(apiServiceModule, applicationContextModule, locationModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final Activity activity;

    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private Provider<FragmentActivity> provideFragmentActivityProvider;

    private Provider<LocationPermissionHelper> locationPermissionHelperProvider;

    private ActivityCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activity = activityParam;
      initialize(activityParam);

    }

    private FragmentActivity fragmentActivity() {
      return ActivityModule_ProvideFragmentActivityFactory.provideFragmentActivity(activity);
    }

    private LocationPermissionHelper locationPermissionHelper() {
      return new LocationPermissionHelper(provideFragmentActivityProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final Activity activityParam) {
      this.provideFragmentActivityProvider = SingleCheck.provider(new SwitchingProvider<FragmentActivity>(singletonC, activityRetainedCImpl, activityCImpl, 1));
      this.locationPermissionHelperProvider = DoubleCheck.provider(new SwitchingProvider<LocationPermissionHelper>(singletonC, activityRetainedCImpl, activityCImpl, 0));
    }

    @Override
    public void injectBetshopsActivity(BetshopsActivity arg0) {
      injectBetshopsActivity2(arg0);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return Collections.<String>singleton(BetshopsViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    private BetshopsActivity injectBetshopsActivity2(BetshopsActivity instance) {
      BetshopsActivity_MembersInjector.injectLocationPermissionHelper(instance, locationPermissionHelperProvider.get());
      BetshopsActivity_MembersInjector.injectFusedLocationClient(instance, singletonC.provideFusedLocationClientProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.activityCImpl = activityCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.nikec.betshops.util.LocationPermissionHelper 
          return (T) activityCImpl.locationPermissionHelper();

          case 1: // androidx.fragment.app.FragmentActivity 
          return (T) activityCImpl.fragmentActivity();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<BetshopsViewModel> betshopsViewModelProvider;

    private ViewModelCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private BetshopsViewModel betshopsViewModel() {
      return new BetshopsViewModel(singletonC.betshopRepositoryImpl());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.betshopsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return Collections.<String, Provider<ViewModel>>singletonMap("com.nikec.betshops.ui.BetshopsViewModel", (Provider) betshopsViewModelProvider);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.nikec.betshops.ui.BetshopsViewModel 
          return (T) viewModelCImpl.betshopsViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerApp_HiltComponents_SingletonC singletonC, Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.google.android.gms.location.FusedLocationProviderClient 
        return (T) singletonC.fusedLocationProviderClient();

        case 1: // com.nikec.betshops.data.ApiService 
        return (T) singletonC.apiService();

        case 2: // retrofit2.Retrofit 
        return (T) singletonC.retrofit();

        case 3: // okhttp3.OkHttpClient 
        return (T) ApiServiceModule_CreateOkHttpClientFactory.createOkHttpClient(singletonC.apiServiceModule);

        default: throw new AssertionError(id);
      }
    }
  }
}
