package com.orangehrmlive.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CutAndOrderDate {

    private String  date;
    private static Pattern pattern;
    private static Matcher matcher;

    public static String  cutYear(String date){
        pattern = Pattern.compile("\\d{4}");
        matcher = pattern.matcher(date);
        return matcher.group();
    }

    public static String convertDateFormat(String date) {
        String[] parts = date.split("-");

        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        return year + "-" + day + "-" + month;
    }
}
