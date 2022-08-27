package com.student.model.course;

public class CourseDetailsViewModel {

    private Long coursePk;
    private String courseName;
    private Integer coursePrice;
    private CourseDuration courseDuration;
    private String createdTs;

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

    public CourseDuration getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(CourseDuration courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }
}
