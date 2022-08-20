package com.student.controller.course;

import com.student.enities.course.CourseDetailsEntity;
import com.student.model.course.CourseDetailsDTO;
import com.student.model.course.CourseDuration;
import com.student.services.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(CourseController.PATH)
public class CourseAjaxController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/saveCourse")
    public ModelAndView saveCourse(@RequestBody CourseDetailsDTO courseDetailsDTO){

        courseDetailsDTO.setCourseDuration(CourseDuration.TWO_MONTHS);
        courseDetailsDTO.setCourseName("MCA");
        courseDetailsDTO.setCoursePrice(4500);

        CourseDetailsEntity courseDetailsEntity1 = courseService.saveCourse(courseDetailsDTO);
        String courseDuration = courseDetailsEntity1.getCourseDuration();
        return null;
    }
}
