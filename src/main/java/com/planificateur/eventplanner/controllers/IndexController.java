package com.planificateur.eventplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private static final String LAYOUT_PAGE = "layout/layout";

    @RequestMapping("")
    String index(Model m){
        m.addAttribute("page", "index");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/calendar-general")
    String calendar(Model m){
        m.addAttribute("page", "calendar");
        return LAYOUT_PAGE;
    }
    @RequestMapping("/calendar-place")
    String calendarPlace(Model m){
        m.addAttribute("page", "calendar-place");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/clients-general")
    String clientsGeneral(Model m) {
        m.addAttribute("page", "clients-general");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/clients-place")
    String clientsPlace(Model m) {
        m.addAttribute("page", "clients-place");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/places")
    String places(Model m) {
        m.addAttribute("page", "places");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/managers")
    String managers(Model m){
        m.addAttribute("page", "managers");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/packages")
    String pagackes(Model m){
        m.addAttribute("page", "packages");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/charts")
    String charts(Model m){
        m.addAttribute("page", "charts");
        return LAYOUT_PAGE;
    }

    @RequestMapping("/payments")
    String payments(Model m){
        m.addAttribute("page", "payments");
        return LAYOUT_PAGE;
    }
    @RequestMapping("/payments-new")
    String newPayment(Model m){
        m.addAttribute("page", "new-payment");
        return LAYOUT_PAGE;
    }


}
