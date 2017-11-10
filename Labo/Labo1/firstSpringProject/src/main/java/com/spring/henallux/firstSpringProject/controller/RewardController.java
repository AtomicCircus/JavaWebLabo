package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.model.Constants;
import com.spring.henallux.firstSpringProject.model.User;
import com.spring.henallux.firstSpringProject.service.GiftService;
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
@RequestMapping(value="/gift")
@SessionAttributes({Constants.CURRENT_USER})
public class RewardController {
    private GiftService listGift;
    @Autowired
    public RewardController(GiftService giftService){this.listGift=giftService;}

    @RequestMapping (method= RequestMethod.GET)
    public String home(Model model,@ModelAttribute(value=Constants.CURRENT_USER)User user){

        String message ="Congratulations "+user.getName()+", you'll receive a "+listGift.getReward(user.getHobby(),user.getAge());
        model.addAttribute("messageGift",message);
        return "integrated:gift";
    }


}