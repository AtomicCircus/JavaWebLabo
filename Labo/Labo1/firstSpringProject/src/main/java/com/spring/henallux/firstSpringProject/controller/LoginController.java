package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.dataAccess.entity.UserEntity;
import com.spring.henallux.firstSpringProject.model.MagicKeyForm;
import com.spring.henallux.firstSpringProject.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.Authentication;

@Controller
@RequestMapping(value="/login")
public class LoginController {

    @RequestMapping(method= RequestMethod.GET)
    public String home(Model model,Authentication authentication){
        if(authentication!=null){
            UserEntity user = (UserEntity)(authentication.getPrincipal());
            System.out.println(user.getUsername());
        }
        //System.out.println("frfrfr");
        //UserEntity user = (UserEntity)authentication.getPrincipal();
        //System.out.println(user.getUsername()+" "+user.getPassword());
        BCryptPasswordEncoder c = new BCryptPasswordEncoder();
        //System.out.println("psw : "+c.encode("coucou"));
        model.addAttribute("title","Page Web");
        model.addAttribute("user",new UserEntity());
        return "integrated:login";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String post(Model model,Authentication authentication, @ModelAttribute(value="user")UserEntity user){
        //System.out.println(((UserEntity)authentication.getPrincipal()).getUsername());
        System.out.println("psw");
        //System.out.println(user.getPassword());

        //System.out.println(user.getUsername());
        return "integrated:login";
    }

}
