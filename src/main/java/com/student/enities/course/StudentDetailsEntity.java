package com.student.enities.course;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_DETAILS")
public class StudentDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "STUDENT_DETAILS_SEQ")
    @TableGenerator(name = "STUDENT_DETAILS_SEQ",
            allocationSize = 1,
            table = "SEQUENCES_ALL",
            pkColumnValue = "STUDENT_DETAILS_SEQUENCE")
    private Long studentPk;
    private String studentName;
    private Integer studentAge;
    private String studentGender;

    public Long getStudentPk() {
        return studentPk;
    }

    public void setStudentPk(Long studentPk) {
        this.studentPk = studentPk;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }
}
