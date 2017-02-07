/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation.Inherited;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 19:54 Exp $
 */
public class InheritableSon extends InheritableFather {
    public InheritableSon() {
        System.out.println("InheritableSon:"+ InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }
}
