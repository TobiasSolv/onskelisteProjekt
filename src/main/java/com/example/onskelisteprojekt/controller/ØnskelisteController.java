package com.example.onskelisteprojekt.controller;

import com.example.onskelisteprojekt.service.├śnskelisteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller

public class ├śnskelisteController {
    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }


    @GetMapping("/wishlist")
    public String wishlist(){
        return "wishlist";
    }

}
