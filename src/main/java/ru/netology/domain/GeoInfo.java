package ru.netology.domain;

public class GeoInfo {
    private String type;
    private String coordinates;
    private ru.netology.domain.PlaceInfo placeInfo;


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public String getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }


    public ru.netology.domain.PlaceInfo getPlaceInfo() {
        return placeInfo;
    }
    public void setPlaceInfo(ru.netology.domain.PlaceInfo placeInfo) {
        this.placeInfo = placeInfo;
    }
}
