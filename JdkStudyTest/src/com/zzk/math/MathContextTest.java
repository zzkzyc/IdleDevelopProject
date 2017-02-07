/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * 基本独立设置为：
 * precision ：某个操作使用的数字个数；结果舍入到此精度
 * roundingMode ：一个  RoundingMode对象，该对象指定舍入使用的算法。
 *
 * precision是指的是整个数字精确后的长度，而非理解的精度（scale）。
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/17 16:21 zhouzongkun Exp $$
 */
public class MathContextTest {
    public static void main(String[] args) {
        BigDecimal bd1,bd2;

        MathContext mc1,mc2;
        mc1 = new MathContext(4, RoundingMode.UP);
        mc2 = new MathContext(2,RoundingMode.HALF_DOWN);
        bd1 = new BigDecimal(123.2343,mc1);
        System.out.println(bd1);
        bd2 = bd1.setScale(2);
        System.out.println(bd2);
    }
}
