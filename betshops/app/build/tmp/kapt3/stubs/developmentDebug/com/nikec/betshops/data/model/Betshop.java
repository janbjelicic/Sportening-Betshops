package com.nikec.betshops.data.model;

import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.squareup.moshi.Json;
import kotlinx.parcelize.Parcelize;
import java.time.LocalTime;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u00c6\u0001J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\t\u0010)\u001a\u00020\u0007H\u00d6\u0001J\u000e\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u00063"}, d2 = {"Lcom/nikec/betshops/data/model/Betshop;", "Lcom/google/maps/android/clustering/ClusterItem;", "Landroid/os/Parcelable;", "address", "", "city", "cityId", "", "county", "id", "location", "Lcom/nikec/betshops/data/model/Location;", "name", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILcom/nikec/betshops/data/model/Location;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getCityId", "()I", "getCounty", "getId", "getLocation", "()Lcom/nikec/betshops/data/model/Location;", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "getPosition", "Lcom/google/android/gms/maps/model/LatLng;", "getSnippet", "getTitle", "hashCode", "isBetshopOpen", "now", "Ljava/time/LocalTime;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_developmentDebug"})
public final class Betshop implements com.google.maps.android.clustering.ClusterItem, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String city = null;
    private final int cityId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String county = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.nikec.betshops.data.model.Location location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    public static final android.os.Parcelable.Creator<com.nikec.betshops.data.model.Betshop> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nikec.betshops.data.model.Betshop copy(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @com.squareup.moshi.Json(name = "city_id")
    int cityId, @org.jetbrains.annotations.NotNull()
    java.lang.String county, int id, @org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.model.Location location, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Betshop(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @com.squareup.moshi.Json(name = "city_id")
    int cityId, @org.jetbrains.annotations.NotNull()
    java.lang.String county, int id, @org.jetbrains.annotations.NotNull()
    com.nikec.betshops.data.model.Location location, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getCityId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCounty() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nikec.betshops.data.model.Location component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nikec.betshops.data.model.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.gms.maps.model.LatLng getPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSnippet() {
        return null;
    }
    
    public final boolean isBetshopOpen(@org.jetbrains.annotations.NotNull()
    java.time.LocalTime now) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.nikec.betshops.data.model.Betshop> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.nikec.betshops.data.model.Betshop createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.nikec.betshops.data.model.Betshop[] newArray(int size) {
            return null;
        }
    }
}