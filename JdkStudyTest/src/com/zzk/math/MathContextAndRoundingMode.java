/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.math;

import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/17 16:11 zhouzongkun Exp $$
 */
public class MathContextAndRoundingMode {
    public static void main(String[] args) {
        MathContext mc1,mc2;
        mc1 = new MathContext(4);
        mc2 = new MathContext(50, RoundingMode.CEILING);
        System.out.println(mc1.getRoundingMode());
        System.out.println(mc1.getPrecision());
        System.out.println(mc2.getRoundingMode());
    }

}
