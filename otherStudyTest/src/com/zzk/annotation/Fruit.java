/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.annotation;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/6 15:52 Exp $
 */
public class Fruit {

    @FruitName("APPLE")
    private String name;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void dispaly() {
        System.out.println(getName() + ": 颜色为:" + getColor());
    }
}
