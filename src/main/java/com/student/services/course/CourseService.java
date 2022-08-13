package com.student.services.course;

import com.student.enities.course.CourseDetailsEntity;
import com.student.model.course.CourseDetailsDTO;
import com.student.model.course.CourseDetailsViewModel;

import java.util.List;


public interface CourseService {

    public CourseDetailsEntity saveCourse(CourseDetailsDTO courseDetailsDTO);

    public List<CourseDetailsViewModel> findAllCourse();
}
