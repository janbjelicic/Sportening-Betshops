package com.nikec.betshops.util;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;

@dagger.hilt.android.scopes.ActivityScoped()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000f0\u000f0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/nikec/betshops/util/LocationPermissionHelper;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "locationPermissionState", "Lkotlin/Function1;", "Lcom/nikec/betshops/util/LocationPermissionState;", "", "requestLocationSettings", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "requestMultiplePermissions", "", "", "result", "Lcom/nikec/betshops/util/LocationSettings;", "checkPermissionAndLocationService", "shouldShowPermissionAlert", "", "isForegroundPermissionGranted", "isLocationServiceEnabled", "showPermissionDialog", "app_developmentDebug"})
public final class LocationPermissionHelper {
    private final androidx.fragment.app.FragmentActivity activity = null;
    private kotlin.jvm.functions.Function1<? super com.nikec.betshops.util.LocationPermissionState, kotlin.Unit> locationPermissionState;
    private kotlin.jvm.functions.Function1<? super com.nikec.betshops.util.LocationSettings, kotlin.Unit> result;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestMultiplePermissions = null;
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> requestLocationSettings = null;
    
    @javax.inject.Inject()
    public LocationPermissionHelper(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
        super();
    }
    
    public final void checkPermissionAndLocationService(boolean shouldShowPermissionAlert, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.nikec.betshops.util.LocationPermissionState, kotlin.Unit> locationPermissionState) {
    }
    
    private final void showPermissionDialog() {
    }
    
    private final boolean isForegroundPermissionGranted() {
        return false;
    }
    
    private final void isLocationServiceEnabled() {
    }
}