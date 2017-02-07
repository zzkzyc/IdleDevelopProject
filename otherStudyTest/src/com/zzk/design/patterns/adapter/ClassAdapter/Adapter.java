/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.adapter.ClassAdapter;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/28 15:37 Exp $
 */
public class Adapter extends Source implements TargetInterface {

    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
