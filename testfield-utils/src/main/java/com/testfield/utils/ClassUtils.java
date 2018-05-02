package com.testfield.utils;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassUtils {

    public static <V, T extends Serializable> V convert(T source, Class<V> target) throws Exception {

        if (source == null)
            throw new NullPointerException("ClassUtils.convert source is null error!");
        if (target == null)
            throw new NullPointerException("ClassUtils.convert target is null error!");

        Constructor<? extends V> con = target.getConstructor();
        V returnObj = (V) con.newInstance();

        Method[] targetMethods = target.getMethods();
        if (targetMethods == null || targetMethods.length == 0) {
            return returnObj;
        }

        if (targetMethods != null && targetMethods.length != 0) {

        }
        return null;
    }
}
