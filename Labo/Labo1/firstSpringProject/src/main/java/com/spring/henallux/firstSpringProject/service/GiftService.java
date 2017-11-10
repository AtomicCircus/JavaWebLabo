package com.spring.henallux.firstSpringProject.service;

import org.springframework.stereotype.Service;

@Service
public class GiftService {
    public GiftService(){

    }
    public String getReward(String hobby,int age){
        String msg="";
        if(age<5){
            msg="puzzle about "+hobby+" !";
        }else{
            if (age > 10) {
                msg="book about "+hobby+" !";

            }else{
                msg="DVD about "+hobby+" !";
            }
        }
        return msg;
    }
}
