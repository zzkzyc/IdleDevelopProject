/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.common;

/**
 * 测试普通工厂方法实例
 *
 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 9:54 zhouzongkun Exp $$
 */
public class CommonTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produceSender("smss");
        if (sender != null) {
            sender.send();
        }

    }
}
