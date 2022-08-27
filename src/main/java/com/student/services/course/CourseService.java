package com.student.services.course;

import com.student.enities.course.CourseDetailsEntity;
import com.student.model.course.CourseDetailsDTO;
import com.student.model.course.CourseDetailsViewModel;
import com.student.model.course.CourseDuration;
import com.student.repositories.course.CourseRepository;
import com.student.utils.converters.DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public CourseDetailsEntity saveCourse(CourseDetailsDTO courseDetailsDTO) {

        CourseDetailsEntity courseDetailsEntity = new CourseDetailsEntity();
        courseDetailsEntity.setCoursePrice(courseDetailsDTO.getCoursePrice());
        courseDetailsEntity.setCourseDuration(courseDetailsDTO.getCourseDuration());
        courseDetailsEntity.setCourseName(courseDetailsDTO.getCourseName());
        return courseRepository.save(courseDetailsEntity);
    }


    public List<CourseDetailsViewModel> findAllCourse() {
        List<CourseDetailsEntity> allCourses = courseRepository.findAll();
        List<CourseDetailsViewModel> courseList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(allCourses)){
           return  allCourses.stream().map(course ->{
                CourseDetailsViewModel courseDetailsViewModel = new CourseDetailsViewModel();
                courseDetailsViewModel.setCoursePk(course.getCoursePk());
                courseDetailsViewModel.setCoursePrice(course.getCoursePrice());
                courseDetailsViewModel.setCourseName(course.getCourseName());
                courseDetailsViewModel.setCourseDuration(CourseDuration.valueOf(course.getCourseDuration()));
                courseDetailsViewModel.setCreatedTs(DateConverter.dateToString(course.getCreatedTs()));
                return courseDetailsViewModel;
            }).collect(Collectors.toList());
        }
        return courseList;
    }

    public CourseDetailsViewModel findCourseBasedOnCourseId(Long courseId){
        Optional<CourseDetailsEntity> courseDetailsEntityOptional = courseRepository.findById(courseId);
        if(courseDetailsEntityOptional.isPresent()){
            CourseDetailsEntity course = courseDetailsEntityOptional.get();
            CourseDetailsViewModel courseDetailsViewModel = new CourseDetailsViewModel();
            courseDetailsViewModel.setCoursePk(course.getCoursePk());
            courseDetailsViewModel.setCoursePrice(course.getCoursePrice());
            courseDetailsViewModel.setCourseName(course.getCourseName());
            courseDetailsViewModel.setCourseDuration(CourseDuration.valueOf(course.getCourseDuration()));
            courseDetailsViewModel.setCreatedTs(DateConverter.dateToString(course.getCreatedTs()));
            return  courseDetailsViewModel;
        }
        return null;
    }

    public void deleteOneCourseBasedOnCourseId(Long courseId){
        courseRepository.deleteById(courseId);
    }

    public void updateOneCourse(CourseDetailsDTO courseDetailsDTO){
        CourseDetailsEntity courseDetailsEntity = new CourseDetailsEntity();
        courseDetailsEntity.setCoursePk(courseDetailsDTO.getCoursePk());
        courseDetailsEntity.setCoursePrice(courseDetailsDTO.getCoursePrice());
        courseDetailsEntity.setCourseDuration(courseDetailsDTO.getCourseDuration());
        courseDetailsEntity.setCourseName(courseDetailsDTO.getCourseName());
        courseRepository.save(courseDetailsEntity);
    }
}
