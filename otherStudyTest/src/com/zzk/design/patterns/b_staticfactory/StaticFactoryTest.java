/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.b_staticfactory;

/**
 * 静态工厂测试
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/1 14:32 zhouzongkun Exp $$
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        Animal animal = animalFactory.produceAnimal();
        animal.eat();
    }
}
