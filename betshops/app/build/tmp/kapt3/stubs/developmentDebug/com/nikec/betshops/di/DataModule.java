package com.nikec.betshops.di;

import com.nikec.betshops.data.BetshopRepository;
import com.nikec.betshops.data.BetshopRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/nikec/betshops/di/DataModule;", "", "()V", "bindBetshopsRepository", "Lcom/nikec/betshops/data/BetshopRepository;", "betshopsRepositoryImpl", "Lcom/nikec/betshops/data/BetshopRepositoryImpl;", "app_developmentDebug"})
@dagger.Module()
public abstract class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.nikec.betshops.data.BetshopRepository bindBetshopsRepository(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.BetshopRepositoryImpl betshopsRepositoryImpl);
}