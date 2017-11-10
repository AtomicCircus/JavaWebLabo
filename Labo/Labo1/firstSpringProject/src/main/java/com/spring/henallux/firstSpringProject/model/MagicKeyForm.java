package com.spring.henallux.firstSpringProject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MagicKeyForm {



    @NotNull
    private String magicKey;

    public MagicKeyForm(){

    }

    public void setMagicKey(String magicKey) {
        this.magicKey = magicKey;
    }

    public String getMagicKey() {
        return magicKey;
    }
}
