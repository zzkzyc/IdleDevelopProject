/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang.enums.interfaceEnums;

/**
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/20 19:21 zhouzongkun Exp $$
 */
public class InterfaceEnumsTest {
    public static void main(String[] args) {
        double x = 5;
        double y = 2;
        test(BasicOperation.class,x,y);
        System.out.println("----------------------------");
        test(ExtendedOperation.class,x,y);
        System.out.println("----------------------------");
        System.out.println(BasicOperation.MINUS.apply(x,y));
        System.out.println(ExtendedOperation.EXP.apply(x,y));
    }
    private static <T extends Enum<T> & Operation> void test(Class<T> opSet,double x,double y) {
        for (Operation op : opSet.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x,y));
        }
    }
}
