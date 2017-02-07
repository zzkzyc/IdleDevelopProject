/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation;

import java.lang.annotation.*;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 15:49 Exp $
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitColor {
    /** 水果颜色枚举*/
    public enum Color{BLUE,RED,GREEN};

    /** 水果颜色*/
    Color fruitColor() default Color.GREEN;
}
