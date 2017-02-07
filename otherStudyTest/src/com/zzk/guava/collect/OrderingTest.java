/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.List;

/**
 * 排序，是guava一份非常灵活的比较类，可以被用来操作，扩展，当作比较器，排序提供了集合排序的很多控制
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 16:08 Exp $
 */
public class OrderingTest {
    public static void main(String[] args) {
        List<Integer> numberList = Lists.newArrayList(30, 20, 60, 80, 10);
        System.out.println(Ordering.natural().sortedCopy(numberList)); //10,20,30,60,80
        System.out.println(Ordering.natural().reverse().sortedCopy(numberList)); //80,60,30,20,10
        System.out.println(Ordering.natural().min(numberList));//10
        System.out.println(Ordering.natural().max(numberList));//80
        numberList =  Lists.newArrayList(30, 20, 60, 80, null, 10);
        System.out.println(Ordering.natural().nullsLast().sortedCopy(numberList));//10, 20,30,60,80,null
        System.out.println(Ordering.natural().reverse().nullsFirst().sortedCopy(numberList));//null,10,20,30,60,80


        List<String> strLists = Lists.newArrayList("peida","jerry","harry","eva","jhon","neron");
        System.out.println("strLists:" + strLists);
        //自然排序
        Ordering<String> naturalOrdering = Ordering.natural();
        System.out.println("使用Comparable类型的自然顺序， 例如：整数从小到大，字符串是按字典顺序:" +
                naturalOrdering.sortedCopy(strLists));

        Ordering<Object> usingToStringOrdering = Ordering.usingToString();
        System.out.println("使用toString()返回的字符串按字典顺序进行排序:" +
                usingToStringOrdering.sortedCopy(strLists));

        System.out.println("返回一个所有对象的任意顺序， " +
                "即compare(a, b) == 0 就是 a == b (identity equality)。 " +
                "本身的排序是没有任何含义， 但是在VM的生命周期是一个常量。");
        Ordering<Object> arbitraryOrdering = Ordering.arbitrary();
        System.out.println(arbitraryOrdering.sortedCopy(strLists));
    }
}
