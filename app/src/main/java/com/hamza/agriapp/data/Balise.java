package com.hamza.agriapp.data;

public class Balise {
    private String nom;
    private float alttitude;
    private float longitude;

    public Balise(String nom) {
        this.nom = nom;
        this.alttitude = 0.0f;
        this.longitude = 0.0f;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getAlttitude() {
        return alttitude;
    }

    public void setAlttitude(float alttitude) {
        this.alttitude = alttitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
