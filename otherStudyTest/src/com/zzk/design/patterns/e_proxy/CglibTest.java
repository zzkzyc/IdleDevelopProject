package com.zzk.design.patterns.e_proxy;

import com.zzk.design.patterns.e_proxy.cglib.CglibProxy;
import com.zzk.design.patterns.e_proxy.cglib.Teacher;

/**
 * Created by zhouzongkun on 2017/5/10.
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Teacher teacher = (Teacher) cglibProxy.getProxyObject(Teacher.class);
        teacher.say();
    }
}
