package com.nikec.betshops.data;

import com.nikec.betshops.data.model.Betshop;
import com.nikec.betshops.data.model.BoundingBox;
import com.nikec.betshops.util.Result;
import io.reactivex.rxjava3.core.Single;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/nikec/betshops/data/BetshopRepositoryImpl;", "Lcom/nikec/betshops/data/BetshopRepository;", "apiService", "Lcom/nikec/betshops/data/ApiService;", "(Lcom/nikec/betshops/data/ApiService;)V", "fetchBetshops", "Lio/reactivex/rxjava3/core/Single;", "Lcom/nikec/betshops/util/Result;", "", "Lcom/nikec/betshops/data/model/Betshop;", "boundingBox", "Lcom/nikec/betshops/data/model/BoundingBox;", "app_developmentDebug"})
public final class BetshopRepositoryImpl implements com.nikec.betshops.data.BetshopRepository {
    private final com.nikec.betshops.data.ApiService apiService = null;
    
    @javax.inject.Inject()
    public BetshopRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<com.nikec.betshops.util.Result<java.util.List<com.nikec.betshops.data.model.Betshop>>> fetchBetshops(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.model.BoundingBox boundingBox) {
        return null;
    }
}