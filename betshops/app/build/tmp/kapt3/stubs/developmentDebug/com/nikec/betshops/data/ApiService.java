package com.nikec.betshops.data;

import com.nikec.betshops.data.model.BetshopResponse;
import com.nikec.betshops.data.model.BoundingBox;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/nikec/betshops/data/ApiService;", "", "fetchBetshops", "Lio/reactivex/rxjava3/core/Single;", "Lcom/nikec/betshops/data/model/BetshopResponse;", "boundingBox", "Lcom/nikec/betshops/data/model/BoundingBox;", "app_developmentDebug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/betshops")
    public abstract io.reactivex.rxjava3.core.Single<com.nikec.betshops.data.model.BetshopResponse> fetchBetshops(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "boundingBox", encoded = true)
    com.nikec.betshops.data.model.BoundingBox boundingBox);
}