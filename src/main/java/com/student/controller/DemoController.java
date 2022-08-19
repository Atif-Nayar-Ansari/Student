package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by abraun on 10/11/2017.
 */
@Controller
public class DemoController {


    @ModelAttribute("subpage")
    public String navbarActive() {
        return "home-active";
    }

    @RequestMapping(value="/")
    public String home() {
        return "home";
    }

    @RequestMapping(value="/about")
    public String about() {
        return "about";
    }


}
