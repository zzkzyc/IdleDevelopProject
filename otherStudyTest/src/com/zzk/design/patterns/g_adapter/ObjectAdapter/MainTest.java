/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.g_adapter.ObjectAdapter;



/**
 * 测试类
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/28 15:38 Exp $
 */
public class MainTest {
    public static void main(String[] args) {
        Source source = new Source();
        TargetInterface targetInterface = new Adapter(source);
        targetInterface.method1();
        targetInterface.method2();
    }
}
