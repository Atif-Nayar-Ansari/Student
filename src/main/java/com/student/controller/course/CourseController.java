package com.student.controller.course;

import com.student.services.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(CourseController.PATH)
public class CourseController {

    public static final String PATH = "/course";

    @Autowired
    private CourseService courseService;

    @ModelAttribute("subpage")
    public String navbarActive() {
        return "course-active";
    }

    @GetMapping("")
    public String viewAllCourses(Model model){
        model.addAttribute("allCourses",courseService.findAllCourse());
        return "/course/courseView";
    }

    @GetMapping("/createCourse")
    public String load(){
        return "/course/courseCreate";
    }

    @GetMapping("/getOneCourse")
    public ModelAndView getOneCourse(){
        ModelAndView modelAndView = new ModelAndView("/course/fragments/courseModal");
        return modelAndView;
    }
}
