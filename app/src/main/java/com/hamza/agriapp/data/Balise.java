package com.hamza.agriapp.data;

public class Balise {
    private int id;
    private String nom;
    private float altitude;
    private float longitude;

    public Balise() {

    }

    public Balise(String nom) {
        this.nom = nom;
        this.altitude = 0.0f;
        this.longitude = 0.0f;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
