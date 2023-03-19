package com.shimakaze;

import java.lang.reflect.InvocationTargetException;

/**
 * @author: Sh1maka2E
 * @date: 2023/03/19 22:03:53
 */
public class InvokeTests {
    public void method1() {

        System.out.println("method1() invoked");

    }

    public void method2() {

        System.out.println("method2() invoked");

    }

    public void method3() {

        System.out.println("method3() invoked");

    }

    public void invokeMethod(String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        InvokeTests.class.getMethod(methodName,null).invoke(this,null);

    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        new InvokeTests().invokeMethod("method2");

    }
}
