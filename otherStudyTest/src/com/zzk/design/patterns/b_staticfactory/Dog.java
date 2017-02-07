/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.b_staticfactory;

/**
 * 狗
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/1 14:18 zhouzongkun Exp $$
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("a dog eating bone");
    }
}
