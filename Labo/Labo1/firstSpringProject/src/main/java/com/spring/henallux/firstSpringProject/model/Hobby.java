package com.spring.henallux.firstSpringProject.model;

public class Hobby {

    private String name;
    private String id;

    public Hobby(){

    }
    public Hobby(String nom,String id){
        this.name=nom;
        this.id=id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
