package com.spring.henallux.firstSpringProject.model;

import java.awt.*;

public class Product {
    private int id;
    private String nom;
    private int prix;
    private String description;
    private String image;

    public Product(int id,String nom, int prix, String description) {
        this.id=id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
