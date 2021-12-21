package com.nikec.betshops.ui;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.nikec.betshops.R;
import com.nikec.betshops.data.model.Betshop;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014\u00a8\u0006\u000f"}, d2 = {"Lcom/nikec/betshops/ui/BetshopClusterRenderer;", "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;", "Lcom/nikec/betshops/data/model/Betshop;", "context", "Landroid/content/Context;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "clusterManager", "Lcom/google/maps/android/clustering/ClusterManager;", "(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;)V", "onBeforeClusterItemRendered", "", "item", "markerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "app_developmentDebug"})
public final class BetshopClusterRenderer extends com.google.maps.android.clustering.view.DefaultClusterRenderer<com.nikec.betshops.data.model.Betshop> {
    
    public BetshopClusterRenderer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map, @org.jetbrains.annotations.NotNull()
    com.google.maps.android.clustering.ClusterManager<com.nikec.betshops.data.model.Betshop> clusterManager) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    protected void onBeforeClusterItemRendered(@org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.model.Betshop item, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    }
}