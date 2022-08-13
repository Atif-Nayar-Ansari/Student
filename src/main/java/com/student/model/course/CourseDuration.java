package com.student.model.course;

public enum CourseDuration {

    ONE_MONTH("One Month"),
    TWO_MONTHS("Two Months"),
    THREE_MONTHS("Three Months"),
    FOUR_MONTHS("Four Months"),
    FIVE_MONTHS("Five Months"),
    SIX_MONTHS("Six Months"),
    ONE_YEAR("One Year"),
    ONE_YEAR_SIX_MONTHS("1 year Six Months"),
    TWO_YEARS("Two Years");

    final String value;
    CourseDuration(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
