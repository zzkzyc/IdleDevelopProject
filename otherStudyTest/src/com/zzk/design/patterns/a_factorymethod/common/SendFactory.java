/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.common;

/**
 * 发送工厂
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 9:48 zhouzongkun Exp $$
 */
public class SendFactory {
    public Sender produceSender (String sendMethod) {
        if ("sms".equals(sendMethod)) {
            return new SmsSender();
        } else if ("mail".equals(sendMethod)) {
            return new MailSender();
        } else {
            System.out.println("now it isn't support of this send method ");
            return null;
        }
    }
}
