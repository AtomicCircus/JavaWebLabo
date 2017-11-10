package com.spring.henallux.firstSpringProject.service;

import com.spring.henallux.firstSpringProject.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProductService {

    private ArrayList<Product> produits;

    public ProductService(){
        this.produits=new ArrayList<Product>();
        this.produits.add(new Product(1,"Music",13,"1er produit"));
        this.produits.add(new Product(2,"Nature",21,"2eme produit"));
        this.produits.add(new Product(3,"Sport",34,"3eme produit"));
        this.produits.add(new Product(4,"Reading",42,"3eme produit"));
    }

    public void setListeProduct(ArrayList<Product> produits) {
        this.produits = produits;
    }

    public ArrayList<Product> getListeProduct() {
        return produits;
    }
    //Lecture de 1 objet dans la BD
    public Product getProduct(int id){
        if(id==1){
            return produits.get(0);
        }else{
            return produits.get(1);
        }
    }
}
