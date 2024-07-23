package com.orangehrmlive.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CutDate {

    private String date;

    public static String  cutYear(String date){
        return date.substring(date.length() - 4);
    }
}
