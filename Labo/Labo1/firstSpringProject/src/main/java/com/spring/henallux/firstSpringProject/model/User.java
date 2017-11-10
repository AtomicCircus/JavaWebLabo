package com.spring.henallux.firstSpringProject.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User {
    @NotNull
    @Size(min=3,max=7)
    private String name;
    @NotNull
    @Min(value=0)
    @Max(value=100)
    private Integer age;
    @NotNull
    private Boolean male;
    @NotNull
    private String hobby;

    public User(){

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getMale() {
        return male;
    }

    public String getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
