/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation.hibernate;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 17:02 Exp $
 */
public class Student {

    private String name;

    private int age;

    private String sex;

    public String getName() {
        return name;
    }
    @ValueBind(filedType = ValueBind.FiledType.STRING, value = "小红")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @ValueBind(filedType = ValueBind.FiledType.INT, value = "12")
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    @ValueBind(filedType = ValueBind.FiledType.STRING, value = "女")
    public void setSex(String sex) {
        this.sex = sex;
    }
}
