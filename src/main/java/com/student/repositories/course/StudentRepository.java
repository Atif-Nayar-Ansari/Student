package com.student.repositories.course;

import com.student.enities.course.StudentDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentDetailsEntity,Long> {
}
