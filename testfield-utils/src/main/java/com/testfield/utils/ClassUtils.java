package com.testfield.utils;

import java.io.Serializable;
import java.lang.reflect.Method;

public class ClassUtils {

    public static <V, T extends Serializable> V convert(T source, V target) {

        if (source == null)
            throw new NullPointerException("ClassUtils.convert source is null error!");
        if (target == null)
            throw new NullPointerException("ClassUtils.convert target is null error!");

        Class<? extends Object> targetClass = target.getClass();
        Method[] targetMethods = targetClass.getMethods();
        if (targetMethods != null && targetMethods.length != 0) {

        }
        return null;
    }
}
