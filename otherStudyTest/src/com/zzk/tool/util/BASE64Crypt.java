/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.tool.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * BASE64字符串加解密a
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/12 16:03 zhouzongkun Exp $$
 */
public class BASE64Crypt {
    public static String decode(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        try {
            return new String(new BASE64Decoder().decodeBuffer(str));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String encode(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        return (new BASE64Encoder()).encode(str.getBytes());
    }

    public static void main(String[] argv) {
        System.out.println(BASE64Crypt.encode("AB2C45P"));
        System.out.println(BASE64Crypt.decode("QUIyQzQ1UA=="));
        System.out.println(BASE64Crypt.encode("123456"));
        System.out.println(BASE64Crypt.decode("MTIzNDU2"));
        System.out.println(System.getProperty("user.dir"));
    }
}
