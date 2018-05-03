package com.testfield.utils;

public class StringUtils {

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static boolean isNotEmpty(String s) {
        return s != null && s.length() > 0;
    }

    public static boolean isBlank(String s) {
        return isEmpty(s) || s.trim().length() == 0;
    }

    public static boolean isNotBlank(String s) {
        return isNotEmpty(s) && s.trim().length() > 0;
    }
}
