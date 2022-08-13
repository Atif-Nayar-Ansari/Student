package com.student.enities.course;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COURSE_DETAILS")
public class CourseDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "COURSE_DETAILS_SEQ")
    @TableGenerator(name = "COURSE_DETAILS_SEQ",
            allocationSize = 1,
            table = "SEQUENCES_ALL",
            pkColumnValue = "COURSE_DETAILS_SEQUENCE")
    private Long coursePk;
    private String courseName;
    private Integer coursePrice;
    private String courseDuration;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_TS", nullable = false, updatable=false)
    private Date createdTs;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_TS")
    private Date updatedTs;


    public Date getUpdatedTs() {
        return updatedTs;
    }

    public void setUpdatedTs(Date updatedTs) {
        this.updatedTs = updatedTs;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }


    public Long getCoursePk() {
        return coursePk;
    }

    public void setCoursePk(Long coursePk) {
        this.coursePk = coursePk;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Integer coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
}
