package com.student.controller.course;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(CourseController.PATH)
public class CourseController {

    public static final String PATH = "/course";

    @ModelAttribute("subpage")
    public String navbarActive() {
        return "course-active";
    }

    @GetMapping("")
    public String index(){
        return "/course/courseCreate";
    }

    @GetMapping("/view/courses")
    public String viewCourses(){
        return "/course/courseView";
    }
}
