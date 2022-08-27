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

    @GetMapping("/getOneCourse/{courseId}")
    public ModelAndView getOneCourse(@PathVariable("courseId") Long courseId){
        ModelAndView modelAndView = new ModelAndView("course/fragments/courseModal");
        modelAndView.addObject("oneCourse",courseService.findCourseBasedOnCourseId(courseId));
        return modelAndView;
    }

    @DeleteMapping("/deleteOneCourse/{courseId}")
    public void deleteOneCourse(@PathVariable("courseId") Long courseId){
        courseService.deleteOneCourseBasedOnCourseId(courseId);
    }

    @PutMapping("/updateOneCourse")
    public void updateCourse(@RequestBody CourseDetailsDTO courseDetailsDTO){
            courseService.updateOneCourse(courseDetailsDTO);
    }
}
