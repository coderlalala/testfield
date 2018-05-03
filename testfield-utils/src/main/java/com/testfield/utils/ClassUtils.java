package com.testfield.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class ClassUtils {

    public static <V, T> V convert(T source, Class<V> targetClass) throws Exception {

        if (source == null)
            throw new NullPointerException("ClassUtils.convert source is null error!");

        Constructor<? extends V> con = targetClass.getConstructor();
        V returnObj = (V) con.newInstance();

        Field[] targetFields = targetClass.getDeclaredFields();
        if (targetFields == null || targetFields.length == 0) {
            return returnObj;
        }
        Field.setAccessible(targetFields, true);

        Class<? extends Object> sourceClass = source.getClass();
        Field[] sourceFields = sourceClass.getDeclaredFields();
        if (sourceFields == null || sourceFields.length == 0) {
            return returnObj;
        }
        Field.setAccessible(sourceFields, true);

        Map<String, Field> sourceVal = new HashMap<String, Field>(sourceFields.length);
        for (Field field : sourceFields) {
            sourceVal.put(field.getName(), field);
        }

        for (Field field : targetFields) {
            if (Modifier.isFinal(field.getModifiers())) {
                continue;
            }
            String fieldName = field.getName();
            if (sourceVal.containsKey(fieldName) && field.getClass() == sourceVal.get(fieldName).getClass()) {
                field.set(returnObj, sourceVal.get(fieldName).get(source));
            }
        }
        return returnObj;
    }
}
