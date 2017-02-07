/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.system;

/**
 *  获取该电脑处理器个数
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/30 17:50 zhouzongkun Exp $$
 */
public class RuntimeTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
