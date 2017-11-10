package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.dataAccess.dao.ClientDAO;
import com.spring.henallux.firstSpringProject.model.Constants;
import com.spring.henallux.firstSpringProject.model.User;
import com.spring.henallux.firstSpringProject.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping(value="/hello2")
@SessionAttributes({Constants.CURRENT_USER})
public class InscriptionController {

    @ModelAttribute(Constants.CURRENT_USER)
    public User user(){
        return new User();
    }
    private HobbiesService serviceHobby;
    private ClientDAO cdao;
    @Autowired
    public InscriptionController(HobbiesService serviceHobby,ClientDAO c){
        this.cdao=c;
        this.serviceHobby=serviceHobby;
    }

    @RequestMapping (method= RequestMethod.GET)
    public String home(Model model,@ModelAttribute(value=Constants.CURRENT_USER)User user){
        model.addAttribute("title","Page Web");
        model.addAttribute("user",user);
        model.addAttribute("hobbies",serviceHobby.getListeHobby());
        return "integrated:userInscription";
    }
    @RequestMapping(value="/send",method=RequestMethod.POST)
    public String getFormData(Model model, @Valid @ModelAttribute(value=Constants.CURRENT_USER)User user, final BindingResult errors){

        if(!errors.hasErrors()){
            //System.out.println(user.getName()+" "+user.getAge()+" "+user.getMale()+" "+user.getHobby());
            cdao.save(user);
            return "redirect:../gift";
        }
        model.addAttribute("title","Page Web 2");
        model.addAttribute("user",new User());
        model.addAttribute("hobbies",serviceHobby.getListeHobby());

        //model.addAttribute("name","Le nom doit contenir entre 3 et 7 caracteres");
        //return "integrated:userInscription";
        return "redirect:/hello2";
    }

}
