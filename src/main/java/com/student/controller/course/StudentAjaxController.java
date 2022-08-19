package com.student.controller.course;

import com.student.enities.course.StudentDetailsEntity;
import com.student.services.course.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentAjaxController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/save-one-student")
    public void saveStudent(){
        StudentDetailsEntity studentDetailsEntity = new StudentDetailsEntity();
        studentDetailsEntity.setStudentName("Ryan");
        studentDetailsEntity.setStudentAge(20);
        studentDetailsEntity.setStudentGender("Male");
        StudentDetailsEntity studentDetailsEntity1 = studentService.saveStudent(studentDetailsEntity);
        System.out.println("STUDENT PK::::::::"+studentDetailsEntity1.getStudentPk());
    }
}
