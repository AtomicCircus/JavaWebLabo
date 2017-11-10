package com.spring.henallux.firstSpringProject.dataAccess.dao;


import com.spring.henallux.firstSpringProject.dataAccess.entity.MagicKeyEntity;
import com.spring.henallux.firstSpringProject.dataAccess.repository.MagicKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MagicKeyDAO {

    private MagicKeyRepository rep;

    @Autowired
    public MagicKeyDAO(MagicKeyRepository magicKeyRepository){
        this.rep =  magicKeyRepository;
    }

    public ArrayList<String> getMagicKeys(){
        List<MagicKeyEntity> liste = rep.findAll();
        ArrayList<String> retour=new ArrayList<String>();
        for (int i = 0; i < liste.size(); i++) {
            retour.add(liste.get(i).getClef());
            // fruit is an element of the `fruits` array.
        }
        return retour;
    }
}
