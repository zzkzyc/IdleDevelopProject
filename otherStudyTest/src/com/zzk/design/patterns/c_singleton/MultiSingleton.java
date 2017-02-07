/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.c_singleton;

import java.io.Serializable;

/**
 * 此单例借鉴<code>ToStringStyle</code>源码
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/20 16:12 Exp $
 */
public abstract class MultiSingleton implements Serializable{

    private static final long serialVersionUID = 1L;

    public static final MultiSingleton SIMPLE_SINGLETON = new SimpleSingleton();

    public static final MultiSingleton COMPLEX_SINGLETON = new ComplexSingleton();

    private Boolean isSingleton = false;

    private Boolean isComplex = false;

    public MultiSingleton() {
    }

    public Boolean getSingleton() {
        return isSingleton;
    }

    public void setSingleton(Boolean singleton) {
        isSingleton = singleton;
    }

    public Boolean getComplex() {
        return isComplex;
    }

    public void setComplex(Boolean complex) {
        isComplex = complex;
    }

    public void display() {
        if (isSingleton) {
            System.out.println("isSingleton is : true" );
        } else {
            System.out.println("isSingleton is : false" );
        }
    }

    public void complex() {
        if (isComplex) {
            System.out.println("this is complexSingleton");
        } else {
            System.out.println("this is not complexSingleton");
        }
    }

    private static final class SimpleSingleton extends MultiSingleton {
        private static final long serialVersionUID = 1L;

        public SimpleSingleton() {
            super();
            this.setSingleton(true);
        }
        /**
         * <p>Ensure <code>Singleton</ode> after serialization.</p>
         * @return the singleton
         */
        public Object readResolve() {
            return MultiSingleton.SIMPLE_SINGLETON;
        }
    }

    private static final class ComplexSingleton extends MultiSingleton {
        private static final long serialVersionUID = 1L;

        public ComplexSingleton() {
            super();
            this.setComplex(true);
        }

        public Object readResolve() {
            return MultiSingleton.COMPLEX_SINGLETON;
        }
    }
}
