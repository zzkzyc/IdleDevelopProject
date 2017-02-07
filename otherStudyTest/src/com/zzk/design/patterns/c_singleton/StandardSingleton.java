/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.c_singleton;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/20 16:22 Exp $
 */
public class StandardSingleton extends MultiSingleton {
    private static final long serialVersionUID = 1L;
    public StandardSingleton() {
        super();
    }

    public Boolean getSingleton() {
        return super.getSingleton();
    }

    public void setSingleton(Boolean singleton) {
        super.setSingleton(singleton);
    }

    public void display() {
       super.display();
    }
}
