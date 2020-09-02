package com.xztx.test;

/*
 * @Author xztx
 * @Date 2020/8/19 16:56
 **/
public class SingletonTest {

    private static SingletonTest singletonTest = new SingletonTest();

    private SingletonTest() {

    }

    public static SingletonTest getSingletonTest() {
        return singletonTest;
    }

}
