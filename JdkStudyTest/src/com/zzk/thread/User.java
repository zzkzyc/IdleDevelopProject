/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread;

/**
 * yonghu
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/27 19:34 zhouzongkun Exp $$
 */
public class User {
    private String ss;
    private int ssq;

    public User(String ss, int ssq) {
        this.ss = ss;
        this.ssq = ssq;
        System.out.printf("");
    }

    public static void main(String[] args) {

    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public int getSsq() {
        return ssq;
    }

    public void setSsq(int ssq) {
        this.ssq = ssq;
    }
}
