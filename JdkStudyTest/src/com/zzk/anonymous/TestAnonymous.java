package com.zzk.anonymous;

import java.lang.reflect.Method;

/**
 * Created by zhouzongkun on 2017/5/11.
 */
public class TestAnonymous {
    public static MethodFilter USER_DECLARED_METHODS = (method, iTeacher) -> (!method.isBridge() && method.getDeclaringClass() != Object.class);

    public static void main(String[] args) {
        TestAnonymous testAnonymous = new TestAnonymous();
        testAnonymous.sayMyselfSex(new ITeacher() {
            @Override
            public void whichSex() {
                System.out.println("哈哈哈，我是最原始老师，用匿名类写");
            }
        });
        testAnonymous.sayMyselfSex(() -> {
            System.out.println("耶耶耶，我是最时髦的，用了lambda");
            System.out.println("我是一个女老师");
        });

        testAnonymous.sayMyselfSex(() -> System.out.println("我是一个男老师"));


        testAnonymous.sayHello(() -> System.out.println("我是全国大众下的一个学士"));
    }

    public void sayMyselfSex(ITeacher iTeacher) {
        iTeacher.whichSex();
    }



    public void sayHello(Person.IStudent iStudent) {
        iStudent.say();
    }

    public interface MethodFilter {

        /**
         * Determine whether the given method matches.
         * @param method the method to check
         */
        boolean matches(Method method,ITeacher teacher);
    }
}
