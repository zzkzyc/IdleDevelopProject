package com.zzk.spring.core;

import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.List;

/**
 * Created by zhouzongkun on 2017/5/11.
 */
public class ResolvableTypeTest {

    private HashMap<Integer,List<String>> myMap;

    public static void main(String[] args) {
        ResolvableTypeTest resolvableTypeTest = new ResolvableTypeTest();
        resolvableTypeTest.method();
    }


    private void method() {
        try {
            ResolvableType resolvableType = ResolvableType.forField(getClass().getDeclaredField("myMap"));
            System.out.println(resolvableType.getSuperType());
            System.out.println(resolvableType.asMap());
            System.out.println(resolvableType.getGeneric(0).resolve());
            System.out.println(resolvableType.getGeneric(1).resolve());
            System.out.println(resolvableType.getGeneric(1));
            System.out.println(resolvableType.getGeneric(1,0));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
