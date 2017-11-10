package com.spring.henallux.firstSpringProject.dataAccess.dao;

import com.spring.henallux.firstSpringProject.dataAccess.entity.UserEntity;
import com.spring.henallux.firstSpringProject.dataAccess.repository.UserRepository;
import com.spring.henallux.firstSpringProject.dataAccess.util.ProviderConverter;
import com.spring.henallux.firstSpringProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClientDAO {

    private UserRepository cr;
    private ProviderConverter pc;

    @Autowired
    public ClientDAO(UserRepository cr){
        this.cr=cr;
    }

    public void save(User user){
        System.out.println(user.toString());
        UserEntity u = ProviderConverter.userModelToUserEntity(user);
        System.out.println(u.toString());
        cr.save(u);
    }

}
