/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.system;

import java.util.Arrays;
import java.util.List;

/**
 * system数组复制用法
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/1 10:35 zhouzongkun Exp $$
 */
public class ArraycopyTest {
    public static void main(String[] args) {
        Integer[] number = new Integer[] {1,2,3,4,5,7,6,8,9,12,23,34,44};
        Integer[] newNum = new Integer[14];
        System.arraycopy(number,0,newNum,0,Math.min(number.length,newNum.length));
        List<Integer> list =  Arrays.asList(newNum);
        for (int i = 0,size = newNum.length; i < size; i++) {
            System.out.println(newNum[i]);
        }
    }
}
