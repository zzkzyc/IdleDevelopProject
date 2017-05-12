/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.g_adapter.ObjectAdapter;


/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/28 15:37 Exp $
 */
public class Adapter implements TargetInterface {

    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is method2 of ObjectAdapter");
    }
}
