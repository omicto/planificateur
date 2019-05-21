package com.planificateur.eventplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("")
    String index(Model m){
        m.addAttribute("page", "index");
        return "layout/layout";
    }

    @RequestMapping("/calendar")
    String calendar(Model m){
        m.addAttribute("page", "calendar");
        return "layout/layout";
    }
}
