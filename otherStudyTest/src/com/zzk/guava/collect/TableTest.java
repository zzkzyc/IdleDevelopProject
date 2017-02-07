/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

import java.util.Map;

/**
 *  Table：相当于有两个key的map
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 15:49 Exp $
 */
public class TableTest {
    public static void main(String[] args) {
        Table<Integer,Integer,Integer> table = TreeBasedTable.create();
        table.put(1,2,20);
        table.put(2,2,40);
        table.put(1,1,10);
        table.put(3,1,50);
        table.put(2,1,30);
        System.out.println(table.size());
        System.out.println(table.rowKeySet());
        for (Integer i : table.rowKeySet()) {
            Map<Integer,Integer> map = table.row(i);
            for (Integer j : map.keySet()) {
                System.out.print(i + ":"+ j);
                System.out.println(":"+ map.get(j));
            }
        }

    }
}
