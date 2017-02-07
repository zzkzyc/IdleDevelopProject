/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.statics;

/**
 * sms发送方式
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 10:48 zhouzongkun Exp $$
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms send");
    }
}
