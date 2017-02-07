/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation;

import com.zzk.annotation.hibernate.ValueBind;

import java.lang.reflect.Method;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 17:09 Exp $
 */
public class ExplainAnnotationUtil {
    public static Object explainAnnotation(Class clazz) throws Exception{
        Object o = clazz.newInstance();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ValueBind.class)) {
                ValueBind valueBind = method.getAnnotation(ValueBind.class);
                String fieldType = String.valueOf(valueBind.filedType());
                String value = String.valueOf(valueBind.value());
                if (fieldType.equals("INT")) {
                    method.invoke(o,Integer.valueOf(value));
                } else {
                    method.invoke(o,String.valueOf(value));
                }
            }
        }
        return o;
    }
}
