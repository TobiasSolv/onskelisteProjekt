package com.example.onskelisteprojekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ØnskelisteController {

    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }


    @GetMapping("/wishlist")
    public String wishlist(){
        return "wishlist";
    }

}
