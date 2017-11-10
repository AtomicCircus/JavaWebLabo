package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.dataAccess.dao.MagicKeyDAO;
import com.spring.henallux.firstSpringProject.model.MagicKeyForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
@RequestMapping(value="/hello")
public class WelcomeController {
    private MagicKeyDAO mkdao;

    @Autowired
    public WelcomeController(MagicKeyDAO dao){
        this.mkdao=dao;
    }

    @RequestMapping (method= RequestMethod.GET)
    public String home(Model model){
        BCryptPasswordEncoder c = new BCryptPasswordEncoder();
        //System.out.println(c.encode("coucou"));
        model.addAttribute("title","Page Web");
        model.addAttribute("magicKeyForm",new MagicKeyForm());
        return "integrated:welcome";
    }
    @RequestMapping(method=RequestMethod.POST)
    public String getFormData(Model model, @Valid @ModelAttribute(value="magicKeyForm")MagicKeyForm inscription, final BindingResult errors){

        if(!errors.hasErrors() && mkdao.getMagicKeys().contains(inscription.getMagicKey())){
            //return "integrated:userInscription";
            return "redirect:/hello2";
        }
        //return "redirect:/hello";
        return "integrated:welcome";
    }
}
