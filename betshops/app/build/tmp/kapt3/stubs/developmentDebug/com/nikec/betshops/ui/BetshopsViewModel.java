package com.nikec.betshops.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.nikec.betshops.data.BetshopRepository;
import com.nikec.betshops.data.model.Betshop;
import com.nikec.betshops.data.model.BoundingBox;
import com.nikec.betshops.util.Event;
import com.nikec.betshops.util.HttpError;
import com.nikec.betshops.util.NetworkError;
import com.nikec.betshops.util.Result;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.observers.DisposableSingleObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/nikec/betshops/ui/BetshopsViewModel;", "Landroidx/lifecycle/ViewModel;", "betshopRepository", "Lcom/nikec/betshops/data/BetshopRepository;", "(Lcom/nikec/betshops/data/BetshopRepository;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nikec/betshops/util/Event;", "Lcom/nikec/betshops/ui/BetshopsErrorUiState;", "_state", "Lcom/nikec/betshops/ui/BetshopsUiState;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "state", "getState", "fetchBetshops", "", "boundingBox", "Lcom/nikec/betshops/data/model/BoundingBox;", "onCleared", "BetshopSubscriber", "app_developmentDebug"})
public final class BetshopsViewModel extends androidx.lifecycle.ViewModel {
    private final com.nikec.betshops.data.BetshopRepository betshopRepository = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposable = null;
    private final androidx.lifecycle.MutableLiveData<com.nikec.betshops.ui.BetshopsUiState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.nikec.betshops.ui.BetshopsUiState> state = null;
    private final androidx.lifecycle.MutableLiveData<com.nikec.betshops.util.Event<com.nikec.betshops.ui.BetshopsErrorUiState>> _error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.nikec.betshops.util.Event<com.nikec.betshops.ui.BetshopsErrorUiState>> error = null;
    
    @javax.inject.Inject()
    public BetshopsViewModel(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.BetshopRepository betshopRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nikec.betshops.ui.BetshopsUiState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.nikec.betshops.util.Event<com.nikec.betshops.ui.BetshopsErrorUiState>> getError() {
        return null;
    }
    
    public final void fetchBetshops(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.model.BoundingBox boundingBox) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/nikec/betshops/ui/BetshopsViewModel$BetshopSubscriber;", "Lio/reactivex/rxjava3/observers/DisposableSingleObserver;", "Lcom/nikec/betshops/util/Result;", "", "Lcom/nikec/betshops/data/model/Betshop;", "(Lcom/nikec/betshops/ui/BetshopsViewModel;)V", "onError", "", "error", "", "onSuccess", "result", "app_developmentDebug"})
    public final class BetshopSubscriber extends io.reactivex.rxjava3.observers.DisposableSingleObserver<com.nikec.betshops.util.Result<? extends java.util.List<? extends com.nikec.betshops.data.model.Betshop>>> {
        
        public BetshopSubscriber() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        com.nikec.betshops.util.Result<? extends java.util.List<com.nikec.betshops.data.model.Betshop>> result) {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
        }
    }
}