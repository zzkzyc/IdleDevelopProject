/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.base;

import com.google.common.base.Preconditions;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 19:45 Exp $
 */
public class PreconditionsTest {
    public static void main(String[] args){
        try {
            getPersonByPrecondition(8,"peida");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            getPersonByPrecondition(-9,"peida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8,"");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8,null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Preconditions.checkElementIndex(0,1));
        System.out.println(Preconditions.checkElementIndex(0, 2));
        System.out.println(Preconditions.checkElementIndex(1, 2));
       // System.out.println(Preconditions.checkElementIndex(-1, 1));
    }

    public static void getPersonByPrecondition(int age,String neme)throws Exception{
        Preconditions.checkNotNull(neme, "neme为null");
        Preconditions.checkArgument(neme.length()>0, "neme为\'\'");
        Preconditions.checkArgument(age>0, "age 必须大于0");
        System.out.println("a person age:"+age+",neme:"+neme);
    }
}
