package com.student.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {


    @GetMapping("")
    public String login(Model model){
        return "general/login";
    }


    @GetMapping("/info")
    public String getInfo(Model model){
        model.addAttribute("activePage", "info");
        return "info";
    }

    @GetMapping("/contact")
    public String getContact(Model model){
        model.addAttribute("activePage", "contact");
        return "contact";
    }
}
