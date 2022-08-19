package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @ModelAttribute("subpage")
    public String navbarActive() {
        return "contact-active";
    }

    @RequestMapping(value="/contact")
    public String contact() {
        return "contact";
    }

}
