package com.nikec.betshops.ui;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.nikec.betshops.R;
import com.nikec.betshops.data.model.Betshop;
import com.nikec.betshops.data.model.BoundingBox;
import com.nikec.betshops.databinding.ActivityBetshopsBinding;
import com.nikec.betshops.util.EventObserver;
import com.nikec.betshops.util.LocationPermissionHelper;
import com.nikec.betshops.util.LocationPermissionState;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0002J\b\u0010\'\u001a\u00020$H\u0003J\u001c\u0010(\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020$0*H\u0003J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u00102\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u001cH\u0016J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020$H\u0002J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020+H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006="}, d2 = {"Lcom/nikec/betshops/ui/BetshopsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;", "Lcom/nikec/betshops/data/model/Betshop;", "()V", "betshopClusterAlgorithm", "Lcom/google/maps/android/clustering/algo/Algorithm;", "betshopClusterRenderer", "Lcom/nikec/betshops/ui/BetshopClusterRenderer;", "binding", "Lcom/nikec/betshops/databinding/ActivityBetshopsBinding;", "clusterManager", "Lcom/google/maps/android/clustering/ClusterManager;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "lastSelectedItem", "locationPermissionHelper", "Lcom/nikec/betshops/util/LocationPermissionHelper;", "getLocationPermissionHelper", "()Lcom/nikec/betshops/util/LocationPermissionHelper;", "setLocationPermissionHelper", "(Lcom/nikec/betshops/util/LocationPermissionHelper;)V", "map", "Lcom/google/android/gms/maps/GoogleMap;", "viewModel", "Lcom/nikec/betshops/ui/BetshopsViewModel;", "getViewModel", "()Lcom/nikec/betshops/ui/BetshopsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "drawMarkers", "", "newMarkerList", "", "getUserLocation", "locationFallback", "onLocation", "Lkotlin/Function1;", "Landroid/location/Location;", "observeErrorState", "observeUiState", "onCameraIdle", "onClusterItemClick", "", "item", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "showToast", "message", "", "zoomToDefaultLocation", "zoomToUserLocation", "location", "app_developmentDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BetshopsActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener<com.nikec.betshops.data.model.Betshop> {
    private com.google.android.gms.maps.GoogleMap map;
    private com.nikec.betshops.databinding.ActivityBetshopsBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.google.maps.android.clustering.ClusterManager<com.nikec.betshops.data.model.Betshop> clusterManager;
    private com.nikec.betshops.ui.BetshopClusterRenderer betshopClusterRenderer;
    private com.google.maps.android.clustering.algo.Algorithm<com.nikec.betshops.data.model.Betshop> betshopClusterAlgorithm;
    private com.nikec.betshops.data.model.Betshop lastSelectedItem;
    @javax.inject.Inject()
    public com.nikec.betshops.util.LocationPermissionHelper locationPermissionHelper;
    @javax.inject.Inject()
    public com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    
    public BetshopsActivity() {
        super();
    }
    
    private final com.nikec.betshops.ui.BetshopsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nikec.betshops.util.LocationPermissionHelper getLocationPermissionHelper() {
        return null;
    }
    
    public final void setLocationPermissionHelper(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.util.LocationPermissionHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationClient() {
        return null;
    }
    
    public final void setFusedLocationClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void onCameraIdle() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getUserLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void locationFallback(kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> onLocation) {
    }
    
    private final void zoomToUserLocation(android.location.Location location) {
    }
    
    private final void zoomToDefaultLocation() {
    }
    
    private final void observeUiState() {
    }
    
    private final void drawMarkers(java.util.List<com.nikec.betshops.data.model.Betshop> newMarkerList) {
    }
    
    private final void observeErrorState() {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    @java.lang.Override()
    public boolean onClusterItemClick(@org.jetbrains.annotations.Nullable()
    com.nikec.betshops.data.model.Betshop item) {
        return false;
    }
}