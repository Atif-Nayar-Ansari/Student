package com.student.utils.converters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    public static final String datePattern = "dd-MM-yyyy";

    public static String dateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat(DateConverter.datePattern);
        return dateFormat.format(date);
    }
}
