package com.student.repositories.course;

import com.student.enities.course.CourseDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseDetailsEntity,Long> {
}
