/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation.hibernate;

import com.zzk.annotation.ExplainAnnotationUtil;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 17:34 Exp $
 */
public class Test {
    public static void main(String[] args) {
        try {
            Student student = (Student) ExplainAnnotationUtil.explainAnnotation(Student.class);
            System.out.println("村里有个" + student.getSex() + "孩，他的名字叫：" + student.getName() + ",年龄："
                               + student.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
