/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.statics;

/**
 * 静态工厂测试类
 *
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 10:56 zhouzongkun Exp $$
 */
public class StaticsTest {
    public static void main(String[] args) {
        Sender sender = SenderFactory.produceMailSender();
        sender.send();
    }
}
