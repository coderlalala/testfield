package com.testfield.utils;

import com.testfield.utils.bean.Person;
import com.testfield.utils.bean.Student;

public class TestClassUtils {

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(111);
        s.setName("张三");
        s.setAge(29);

        try {
            Person p = ClassUtils.convert(s, Person.class);
            System.out.println(p.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
