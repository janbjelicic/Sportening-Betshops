package com.nikec.betshops.data;

import com.nikec.betshops.data.model.Betshop;
import com.nikec.betshops.data.model.BoundingBox;
import com.nikec.betshops.util.Result;
import io.reactivex.rxjava3.core.Single;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/nikec/betshops/data/BetshopRepository;", "", "fetchBetshops", "Lio/reactivex/rxjava3/core/Single;", "Lcom/nikec/betshops/util/Result;", "", "Lcom/nikec/betshops/data/model/Betshop;", "boundingBox", "Lcom/nikec/betshops/data/model/BoundingBox;", "app_developmentDebug"})
public abstract interface BetshopRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.nikec.betshops.util.Result<java.util.List<com.nikec.betshops.data.model.Betshop>>> fetchBetshops(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.model.BoundingBox boundingBox);
}