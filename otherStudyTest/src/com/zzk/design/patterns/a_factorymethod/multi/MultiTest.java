/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.multi;

/**
 * 多工厂模式测试类
 *
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 10:17 zhouzongkun Exp $$
 */
public class MultiTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produceMailSender();
        sender.send();
    }
}
