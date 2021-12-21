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

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/nikec/betshops/ui/BetshopsErrorUiState;", "", "(Ljava/lang/String;I)V", "SERVER_ERROR", "NETWORK_ERROR", "UNKNOWN_ERROR", "app_developmentDebug"})
public enum BetshopsErrorUiState {
    /*public static final*/ SERVER_ERROR /* = new SERVER_ERROR() */,
    /*public static final*/ NETWORK_ERROR /* = new NETWORK_ERROR() */,
    /*public static final*/ UNKNOWN_ERROR /* = new UNKNOWN_ERROR() */;
    
    BetshopsErrorUiState() {
    }
}