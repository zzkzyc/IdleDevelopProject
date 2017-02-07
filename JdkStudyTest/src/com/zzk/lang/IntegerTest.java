/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang;

/**
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/3 22:09 zhouzongkun Exp $$
 */
public class IntegerTest {
    final static char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9' , 'a' , 'b' ,
            'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
            'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
            'o' , 'p' , 'q' , 'r' , 's' , 't' ,
            'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
    public static void main(String[] args) {
        //Integer i = 10;
        //System.out.println(Integer.reverseBytes(12));
        System.out.println(Integer.toHexString(-1));
        System.out.println(Integer.toHexString(1));
        System.out.println(-1>>31);
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1>>10));
        System.out.println(1>>>31);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toHexString(Integer.MAX_VALUE));

        System.out.println(Integer.toBinaryString((1<<31)-1));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(-1<<31));
        System.out.println(Integer.signum(123));

        System.out.println(toString(65,16));

    }
    public static String toString(int i, int radix) {

        if (radix < Character.MIN_RADIX || radix > Character.MAX_RADIX)
            radix = 10;


        char buf[] = new char[33];
        boolean negative = (i < 0);
        int charPos = 32;

        if (!negative) {
            i = -i;
        }

        while (i <= -radix) {
            buf[charPos--] = digits[-(i % radix)];
            i = i / radix;
        }
        buf[charPos] = digits[-i];

        if (negative) {
            buf[--charPos] = '-';
        }

        return new String(buf, charPos, (33 - charPos));
    }
}
