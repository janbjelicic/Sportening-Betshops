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

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"PERMISSION_DIALOG_TAG", "", "app_developmentDebug"})
public final class LocationPermissionHelperKt {
    private static final java.lang.String PERMISSION_DIALOG_TAG = "PermissionDialog";
}