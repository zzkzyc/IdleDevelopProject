package com.zzk.design.patterns.e_proxy;

import com.zzk.design.patterns.e_proxy.dynamic.*;

/**
 * Created by zhouzongkun on 2017/5/10.
 */
public class DynamicTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        CustomInvocationHandler customInvocationHandler = new CustomInvocationHandler();
        IPerson person = (IPerson) customInvocationHandler.getProxyObject(teacher);
        person.say();

        System.out.println("==========================");

        Student student = new Student();
        IPerson studentPerson = (IPerson) customInvocationHandler.getProxyObject(student);
        studentPerson.run();


        System.out.println("*************************");
        Teacher teacher1 = new Teacher();
        IPerson person1 = (IPerson) customInvocationHandler.getProxyObject(teacher1);
        person1.run();
    }
}
