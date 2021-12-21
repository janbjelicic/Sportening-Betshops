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

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"DEFAULT_ZOOM", "", "LOCATION_REQUEST_FASTEST_INTERVAL", "", "LOCATION_REQUEST_INTERVAL", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "app_developmentDebug"})
public final class BetshopsActivityKt {
    private static final long LOCATION_REQUEST_INTERVAL = 10000L;
    private static final long LOCATION_REQUEST_FASTEST_INTERVAL = 5000L;
    private static final float DEFAULT_ZOOM = 14.0F;
    private static final com.google.android.gms.maps.model.LatLng defaultLocation = null;
}