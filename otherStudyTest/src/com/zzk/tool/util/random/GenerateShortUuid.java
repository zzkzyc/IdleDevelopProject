/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.tool.util.random;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * 生成8位uuid
 *
 * 短8位UUID思想其实借鉴微博短域名的生成方式，但是其重复概率过高，而且每次生成4个，需要随即选取一个。

 * 本算法利用62个可打印字符，通过随机生成32位UUID，由于UUID都为十六进制，所以将UUID分成8组，每4个为一组，然后通过模62操作，
 * 结果作为索引取出字符，
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/6 14:41 zhouzongkun Exp $$
 */
public class GenerateShortUuid {

    /*public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };


    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            //0x3E == 62
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();

    }*/
    public static String[] chars = new String[] {  "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H",
            "J", "K", "L", "M", "N",  "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };


    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            //0x3E == 62
            shortBuffer.append(chars[x % 34]);
        }
        return shortBuffer.toString();

    }

    public static void main(String[] args) {
        //generateShortUuid();
        final int num = 100000; // 1,000,000
        final Set<String> rs_set = new HashSet<String>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Set<String> set = new HashSet<String>();
                for (int i = 0; i < num; i++) {
                    String s =GenerateShortUuid.generateShortUuid();
                    set.add(s);
                    rs_set.add(s);
                }
                System.out.println(Thread.currentThread().getName() + "Rs_Count:" + set.size() + " &Repeated Count:" + (num - set.size()));
                System.out.println(Thread.currentThread().getName()+ ":"+ rs_set.size());
            }
        }).start();
        try {
            Thread.sleep(1000 * 30 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       new Thread(new Runnable() {
            @Override
            public void run() {
                Set<String> set = new HashSet<String>();
                for (int i = 0; i < num; i++) {
                    String s =GenerateShortUuid.generateShortUuid();
                    set.add(s);
                    rs_set.add(s);
                }
                System.out.println(Thread.currentThread().getName() + "Rs_Count:" + set.size() + " &Repeated Count:" + (num - set.size()));
                System.out.println(Thread.currentThread().getName()+ ":"+ rs_set.size());
            }
        }).start();

        try {
            Thread.sleep(1000 * 60 *5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Release RS||" + "Rs_Count:" + rs_set.size() + " &Repeated Count:" + ((num * 2) - rs_set.size()));
    }
}
