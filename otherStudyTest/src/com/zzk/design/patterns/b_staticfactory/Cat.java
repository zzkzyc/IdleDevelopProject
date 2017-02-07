/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.b_staticfactory;

/**
 * 猫
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/1 14:19 zhouzongkun Exp $$
 */
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("a cat eating fish");
    }
}
