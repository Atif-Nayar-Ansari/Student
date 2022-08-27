package com.student.controller.student.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(StudentRegistrationController.PATH)
public class StudentRegistrationController {

    public final static String PATH = "/student";


    @ModelAttribute("subpage")
    public String navbarActive() {
        return "student-active";
    }

    @GetMapping("")
    public String loadStudentRegistrationForm(){
        return "/student/registration/studentRegistration";
    }
}
