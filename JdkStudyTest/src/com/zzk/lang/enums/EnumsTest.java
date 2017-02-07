/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang.enums;

/**
 * 枚举测试类
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/17 14:10 zhouzongkun Exp $$
 */
public class EnumsTest {
    public static void main(String[] args) {

        //Planet测试
        double earchWeight = 175;
        double mass = earchWeight/Planet.EARCH.getSurfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f%n",p,p.surfaceWeight(mass));
        }

        //Ensemble测试
        for (Ensemble ensemble: Ensemble.values()) {
            System.out.println(ensemble.getNumberOfMusicians());
        }

    }
}
