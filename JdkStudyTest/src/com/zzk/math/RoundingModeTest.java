/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/17 16:17 zhouzongkun Exp $$
 */
public class RoundingModeTest {
    public static void main(String[] args) {
        BigDecimal bd1,bd2;
        bd1 = new BigDecimal(123.6532);
        bd2 = bd1.setScale(2, RoundingMode.UP);
        System.out.println(bd2);
        bd2 = bd1.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println(bd2);
    }
}
