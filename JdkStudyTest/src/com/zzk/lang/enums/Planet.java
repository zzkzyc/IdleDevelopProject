/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang.enums;

/**
 * 行星枚举类
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/17 11:43 zhouzongkun Exp $$
 */
public enum Planet {

    MERCURY (3.302e+23,2.4439e6),

    EARCH   (5.975e+24,6.378e6);

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    private static final double G = 6.67300E-11;

    private double mass;

    private double radius;

    private double surfaceGravity;

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }
}
