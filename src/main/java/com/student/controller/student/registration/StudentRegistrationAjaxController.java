package com.student.controller.student.registration;

import com.student.model.student.registration.StudentRegistrationDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(StudentRegistrationController.PATH)
public class StudentRegistrationAjaxController {

    @PostMapping("/registerStudent")
    public void registerStudent(@RequestBody StudentRegistrationDTO studentRegistrationDTO){
        System.out.println(studentRegistrationDTO);
    }

}
