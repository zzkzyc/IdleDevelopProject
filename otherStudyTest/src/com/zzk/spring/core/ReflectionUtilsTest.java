package com.zzk.spring.core;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;


/**
 * Created by zhouzongkun on 2017/5/11.
 */
public class ReflectionUtilsTest {
    public static void main(String[] args) {
        Field field = ReflectionUtils.findField(Teacher.class,"name");
        System.out.println(field);
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        ReflectionUtils.setField(field,new Person(),"zzk");
        System.out.println(ReflectionUtils.getField(field,new Person()));
    }

}
