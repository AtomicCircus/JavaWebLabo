package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/product")
public class ProductController {

    private ProductService serviceProduct;
    @Autowired
    public ProductController(ProductService serviceProduct){
        this.serviceProduct=serviceProduct;
    }

    @RequestMapping(value="{id}",method= RequestMethod.GET)
    public String home(@PathVariable int id, Model model){

        model.addAttribute("title","Palme d'or");
        model.addAttribute("product",serviceProduct.getProduct(id));
        //Map<String, String> param = getQueryMap();
        //return "integrated:welcome";
        return "integrated:product";
    }


}
