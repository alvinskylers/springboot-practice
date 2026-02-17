package com.alvinskylers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComedyController {

    @Autowired
    ComedyService service;


    @GetMapping("/comedy")
    public String comedy(Model model) {
        String joke = service.getRandomJoke();
        model.addAttribute("joke", joke);
        return "getting_started/comedy";
    }
}
