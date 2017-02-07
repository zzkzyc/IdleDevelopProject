/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.multi;

/**
 * mail发送方式
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 10:08 zhouzongkun Exp $$
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail send");
    }
}
