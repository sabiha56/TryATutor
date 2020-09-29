package com.example.tryatutor.Database;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

public class AddressData implements Serializable {
    private String address;
    private double latitude,longitude;

    public AddressData(String address, double latitude, double longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
