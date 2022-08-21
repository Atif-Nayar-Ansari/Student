package com.student.controller.course;

import com.student.enities.course.CourseDetailsEntity;
import com.student.model.course.CourseDetailsDTO;
import com.student.model.course.CourseDuration;
import com.student.services.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(CourseController.PATH)
public class CourseAjaxController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/saveCourse")
    public ModelAndView saveCourse(@RequestBody CourseDetailsDTO courseDetailsDTO){

        ModelAndView modelAndView = new ModelAndView("/course/courseCreate");
        courseService.saveCourse(courseDetailsDTO);
        return modelAndView;
    }
}
