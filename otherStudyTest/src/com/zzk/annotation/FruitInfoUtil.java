/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation;

import java.lang.reflect.Field;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 16:03 Exp $
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println("水果名称：" + fruitName.value());
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println("水果颜色：" + fruitColor.fruitColor());
            }
        }
    }
}
