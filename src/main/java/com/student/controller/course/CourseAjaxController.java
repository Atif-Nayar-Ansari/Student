package com.student.controller.course;

import com.student.enities.course.CourseDetailsEntity;
import com.student.model.course.CourseDetailsDTO;
import com.student.model.course.CourseDetailsViewModel;
import com.student.model.course.CourseDuration;
import com.student.services.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseAjaxController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/saveCourse")
    public void saveCourse(){
        CourseDetailsDTO courseDetailsDTO = new CourseDetailsDTO();
        courseDetailsDTO.setCourseDuration(CourseDuration.TWO_MONTHS);
        courseDetailsDTO.setCourseName("PG");
        courseDetailsDTO.setCoursePrice(4500);

        CourseDetailsEntity courseDetailsEntity1 = courseService.saveCourse(courseDetailsDTO);
        String courseDuration = courseDetailsEntity1.getCourseDuration();
    }

    @GetMapping("/getAllCourse")
    public void showAllCourse(){
        List<CourseDetailsViewModel> allCourse = courseService.findAllCourse();
        for (CourseDetailsViewModel show: allCourse){
            System.out.println(show.getCoursePk());
            System.out.println(show.getCoursePrice());
            System.out.println(show.getCourseName());
            System.out.println(show.getCourseDuration());
            System.out.println("=================");
        }
    }
}
