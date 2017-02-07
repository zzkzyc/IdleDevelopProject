/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.b_staticfactory;

/**
 * 生成狗的工厂实现类
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/1 14:24 zhouzongkun Exp $$
 */
public class DogFactory implements AnimalFactory {
    @Override
    public Animal produceAnimal() {
        return new Dog();
    }
}
