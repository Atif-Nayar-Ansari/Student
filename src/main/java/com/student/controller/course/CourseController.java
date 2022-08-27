package com.student.controller.course;

import com.student.model.course.CourseDetailsViewModel;
import com.student.model.course.CourseDuration;
import com.student.services.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

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

    @GetMapping("/getOneCourse/{courseId}")
    public ModelAndView getOneCourse(@PathVariable("courseId") Long courseId){
        ModelAndView modelAndView = new ModelAndView("course/fragments/courseModal");
        modelAndView.addObject("oneCourse",courseService.findCourseBasedOnCourseId(courseId));
        //CourseDuration six_months = CourseDuration.valueOf("SIX_MONTHS");
//        CourseDetailsViewModel test = courseService.findCourseBasedOnCourseId(courseId);
//        modelAndView.addObject("c",test.getCourseDuration());
        return modelAndView;
    }
}
