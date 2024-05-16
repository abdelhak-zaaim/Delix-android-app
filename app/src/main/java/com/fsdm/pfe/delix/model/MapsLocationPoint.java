package com.fsdm.pfe.delix.model;

public class MapsLocationPoint {


    private Double latitude;
    private Double longitude;


    public MapsLocationPoint(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public MapsLocationPoint() {

    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}