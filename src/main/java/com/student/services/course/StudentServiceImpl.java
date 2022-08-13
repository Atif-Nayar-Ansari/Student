package com.student.services.course;

import com.student.enities.course.StudentDetailsEntity;
import com.student.repositories.course.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDetailsEntity saveStudent(StudentDetailsEntity studentDetailsEntity) {
        return studentRepository.save(studentDetailsEntity);
    }
}
