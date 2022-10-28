package com.example.onskelisteprojekt.controller;

import com.example.onskelisteprojekt.service.ØnskelisteService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

public class HomeController {

    private ØnskelisteService service = new ØnskelisteService();

    @GetMapping("/homepage")
    public String getØnskeliste(Model model){
        model.addAttribute("ønskeliste",service.getØnskeliste());
        return "ønskeliste";
    }

    @GetMapping("/wishlist")
    public String index(){
        return "index";
    }

    @GetMapping("/wishlist")
    public String create(WebRequest payload){
         service.create(payload);
        return "redirect:/";
    }

}
