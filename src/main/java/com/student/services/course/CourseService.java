package com.student.services.course;

import com.student.enities.course.CourseDetailsEntity;
import com.student.model.course.CourseDetailsDTO;
import com.student.model.course.CourseDetailsViewModel;
import com.student.repositories.course.CourseRepository;
import com.student.utils.converters.DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public CourseDetailsEntity saveCourse(CourseDetailsDTO courseDetailsDTO) {

        CourseDetailsEntity courseDetailsEntity = new CourseDetailsEntity();
        courseDetailsEntity.setCoursePrice(courseDetailsDTO.getCoursePrice());
        courseDetailsEntity.setCourseDuration(courseDetailsDTO.getCourseDuration().getValue());
        courseDetailsEntity.setCourseName(courseDetailsDTO.getCourseName());
        return courseRepository.save(courseDetailsEntity);
    }


    public List<CourseDetailsViewModel> findAllCourse() {
        List<CourseDetailsEntity> allCourses = courseRepository.findAll();
        List<CourseDetailsViewModel> courseList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(allCourses)){
            for (CourseDetailsEntity course : allCourses) {
                CourseDetailsViewModel courseDetailsViewModel = new CourseDetailsViewModel();
                courseDetailsViewModel.setCoursePk(course.getCoursePk());
                courseDetailsViewModel.setCoursePrice(course.getCoursePrice());
                courseDetailsViewModel.setCourseName(course.getCourseName());
                courseDetailsViewModel.setCourseDuration(course.getCourseDuration());
                courseDetailsViewModel.setCreatedTs(DateConverter.dateToString(course.getCreatedTs()));
                courseList.add(courseDetailsViewModel);
            }
        }
        return courseList;
    }
}
