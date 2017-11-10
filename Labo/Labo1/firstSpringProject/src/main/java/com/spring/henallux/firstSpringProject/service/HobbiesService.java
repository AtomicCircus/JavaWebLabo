package com.spring.henallux.firstSpringProject.service;
import com.spring.henallux.firstSpringProject.model.Hobby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class HobbiesService {
    private ArrayList<Hobby> listeHobby;

    public HobbiesService(){
        this.listeHobby=new ArrayList<Hobby>();
        this.listeHobby.add(new Hobby("Music","1"));
        this.listeHobby.add(new Hobby("Nature","2"));
        this.listeHobby.add(new Hobby("Sport","3"));
        this.listeHobby.add(new Hobby("Reading","4"));
    }

    public void setListeHobby(ArrayList<Hobby> listeHobby) {
        this.listeHobby = listeHobby;
    }

    public ArrayList<Hobby> getListeHobby() {
        return listeHobby;
    }
}
