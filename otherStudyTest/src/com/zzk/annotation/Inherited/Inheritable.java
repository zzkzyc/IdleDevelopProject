/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation.Inherited;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义注解Inheritable，并且注解上Inherited，则哪个类使用了这个注解，则这个类的所有子类也带有这个注解
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 19:51 Exp $
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
//@Inherited
public @interface Inheritable {
}
