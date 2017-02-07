/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Iterator;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

/**
 *  BiMap: 是一个一一映射，可以通过key得到value，也可以通过value得到key
 *
 *  在使用BiMap时，会要求Value的唯一性。如果value重复了则会抛出错误：java.lang.IllegalArgumentException
 *
 *  如果我们确实需要插入重复的value值，那可以选择forcePut方法。但是我们需要注意的是前面的key也会被覆盖了。
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 16:04 Exp $
 */
public class BiMapTest {
    public static void main(String[] args) {
        BiMap<Integer,String> biMap = HashBiMap.create();
        biMap.put(1,"wo");
        biMap.put(2,"ni");
        biMap.forcePut(3,"ni");
        System.out.println(biMap.get(2));
        System.out.println(biMap.inverse().get("ni"));
        System.out.println(biMap.inverse().inverse().get(1));


        Map<Integer,String> map = newHashMap();
        Iterator<Integer> iterator = map.keySet().iterator();
        map.put(4,"ta");
        map.put(5,"she");
        biMap.putAll(map);
        System.out.println(map.put(6,"he"));
        System.out.println(biMap.inverse().get("ta"));
        System.out.println("***************打印所有value*****************");
        Iterator<String> iter = biMap.values().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
