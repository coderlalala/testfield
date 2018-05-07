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

    public static boolean isDigit(String str) {
        boolean result = true;
        if (isNotBlank(str)) {
            int len = str.length();
            for (int i = 0; i < len; i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
