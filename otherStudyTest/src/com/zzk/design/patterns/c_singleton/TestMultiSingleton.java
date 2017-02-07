/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.c_singleton;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/20 16:23 Exp $
 */
public class TestMultiSingleton {
    public static void main(String[] args) {
        StandardSingleton standardSingleton1 = new StandardSingleton();
        StandardSingleton standardSingleton2 = new StandardSingleton();
        System.out.println(standardSingleton1.getSingleton());
        System.out.println(standardSingleton1.equals(standardSingleton2));
        standardSingleton1.display();

        System.out.println("***********************");
        MultiSingleton multiSingleton = MultiSingleton.SIMPLE_SINGLETON;
        System.out.println(multiSingleton.getSingleton());
        multiSingleton.setSingleton(false);
        System.out.println(multiSingleton.getSingleton());
        MultiSingleton multiSingleton2 = MultiSingleton.SIMPLE_SINGLETON;
        System.out.println(multiSingleton.equals(multiSingleton2));
        multiSingleton.display();

        System.out.println("==============================");
        MultiSingleton complexSingleton = MultiSingleton.COMPLEX_SINGLETON;
        System.out.println(complexSingleton.getSingleton());
        System.out.println(complexSingleton.getComplex());
        complexSingleton.complex();
    }
}
