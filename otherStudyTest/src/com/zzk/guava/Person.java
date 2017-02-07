/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 9:43 Exp $
 */
public class Person {
    private String name;

    private Integer sex;

    private Integer id;

    public Person(String name, Integer sex, Integer id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", id=" + id +
                '}';
    }
}
