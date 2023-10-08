package com.mybook.mybook.models;

public class BookRequest {
    private String titre;
    private double prix;

    public BookRequest(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    public BookRequest() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
