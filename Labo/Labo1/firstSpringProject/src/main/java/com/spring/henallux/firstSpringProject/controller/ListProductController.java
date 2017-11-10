package com.spring.henallux.firstSpringProject.controller;
import com.spring.henallux.firstSpringProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/listProduct")
public class ListProductController {

    private ProductService serviceProduct;
    @Autowired
    public ListProductController(ProductService serviceProduct){
        this.serviceProduct=serviceProduct;
    }

    @RequestMapping (method= RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("title","Palme d'or");
        model.addAttribute("products",serviceProduct.getListeProduct());
        return "integrated:listProduct";
    }
}
