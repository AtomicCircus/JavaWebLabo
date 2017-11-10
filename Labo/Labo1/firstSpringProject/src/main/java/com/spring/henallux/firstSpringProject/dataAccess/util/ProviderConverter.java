package com.spring.henallux.firstSpringProject.dataAccess.util;


import com.spring.henallux.firstSpringProject.dataAccess.entity.UserEntity;
import com.spring.henallux.firstSpringProject.model.User;

public class ProviderConverter {
    public static UserEntity userModelToUserEntity(User user){
        UserEntity userEntity = new UserEntity();
        /*userEntity.setAge(user.getAge());
        userEntity.setHobby(user.getHobby());
        userEntity.setMale(user.getMale());
        userEntity.setName(user.getName());*/
        return userEntity;
    }
}
