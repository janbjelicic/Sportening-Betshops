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

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nikec/betshops/util/LocationSettings;", "", "(Ljava/lang/String;I)V", "PERMISSION_DENIED", "PERMISSION_GRANTED", "LOCATION_SETTINGS_OFF", "LOCATION_SETTINGS_ON", "app_developmentDebug"})
public enum LocationSettings {
    /*public static final*/ PERMISSION_DENIED /* = new PERMISSION_DENIED() */,
    /*public static final*/ PERMISSION_GRANTED /* = new PERMISSION_GRANTED() */,
    /*public static final*/ LOCATION_SETTINGS_OFF /* = new LOCATION_SETTINGS_OFF() */,
    /*public static final*/ LOCATION_SETTINGS_ON /* = new LOCATION_SETTINGS_ON() */;
    
    LocationSettings() {
    }
}