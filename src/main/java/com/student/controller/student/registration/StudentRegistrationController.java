package com.student.controller.student.registration;

import com.student.services.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(StudentRegistrationController.PATH)
public class StudentRegistrationController {

    public final static String PATH = "/student";

    @Autowired
    private CourseService courseService;

    @ModelAttribute("subpage")
    public String navbarActive() {
        return "student-active";
    }

    @GetMapping("")
    public String loadStudentRegistrationForm(Model model){
        model.addAttribute("allCourses",courseService.findAllCourse());
        return "/student/registration/studentRegistration";
    }
}
