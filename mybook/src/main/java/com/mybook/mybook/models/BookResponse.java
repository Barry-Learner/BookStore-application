package com.mybook.mybook.models;

import com.mybook.mybook.entities.Book;



public class BookResponse {
    private Long id;
    private String titre;
    private double prix;

    public BookResponse(Book book) {
        this.id = book.getId();
        this.titre = book.getTitre();
        this.prix = book.getPrix();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
