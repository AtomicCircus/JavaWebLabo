package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.dataAccess.entity.UserEntity;
import com.spring.henallux.firstSpringProject.model.MagicKeyForm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.Authentication;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

    @RequestMapping(method= RequestMethod.GET)
    public String home(Model model,Authentication authentication){
        UserEntity user = (UserEntity)authentication.getPrincipal();
        //System.out.println(user.getUsername());
        BCryptPasswordEncoder c = new BCryptPasswordEncoder();
        //System.out.println(c.encode("coucou"));
        model.addAttribute("title","Page Web");
        return "integrated:admin";
    }

}
