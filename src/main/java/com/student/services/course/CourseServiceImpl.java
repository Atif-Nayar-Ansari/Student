package com.student.services.course;

import com.student.enities.course.CourseDetailsEntity;
import com.student.model.course.CourseDetailsDTO;
import com.student.model.course.CourseDetailsViewModel;
import com.student.repositories.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public CourseDetailsEntity saveCourse(CourseDetailsDTO courseDetailsDTO) {

        CourseDetailsEntity courseDetailsEntity = new CourseDetailsEntity();
        courseDetailsEntity.setCoursePrice(courseDetailsDTO.getCoursePrice());
        courseDetailsEntity.setCourseDuration(courseDetailsDTO.getCourseDuration().getValue());
        courseDetailsEntity.setCourseName(courseDetailsDTO.getCourseName());
        return courseRepository.save(courseDetailsEntity);
    }

    @Override
    public List<CourseDetailsViewModel> findAllCourse() {
        List<CourseDetailsEntity> all = courseRepository.findAll();
        List<CourseDetailsViewModel> courseList = new ArrayList<>();
        for (CourseDetailsEntity temp : all) {
            CourseDetailsViewModel courseDetailsViewModel = new CourseDetailsViewModel();
            courseDetailsViewModel.setCoursePk(temp.getCoursePk());
            courseDetailsViewModel.setCoursePrice(temp.getCoursePrice());
            courseDetailsViewModel.setCourseName(temp.getCourseName());
            courseDetailsViewModel.setCourseDuration(temp.getCourseDuration());
//            System.out.println(temp.getCreatedTs());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = dateFormat.format(temp.getCreatedTs());
            System.out.println("Date::::::::::::::::"+strDate);
            courseList.add(courseDetailsViewModel);
        }
        return courseList;
    }
}
