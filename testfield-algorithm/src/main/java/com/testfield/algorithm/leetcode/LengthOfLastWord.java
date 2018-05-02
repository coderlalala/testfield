package com.testfield.algorithm.leetcode;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String ts = s.trim();
        return ts.length() - ts.lastIndexOf(" ") - 1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("abcd efgh"));
    }
}
