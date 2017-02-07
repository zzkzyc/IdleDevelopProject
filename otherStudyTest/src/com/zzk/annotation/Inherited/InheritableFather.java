/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation.Inherited;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 19:52 Exp $
 */
@Inheritable
public class InheritableFather {
    public InheritableFather() {
        System.out.println("InheritableFather:" + InheritableFather.class.isAnnotationPresent(Inheritable.class));
    }
}
