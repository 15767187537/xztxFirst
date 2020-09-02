package com.xztx.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MainTest {

    public static void main(String[] args) {
        if(args.length > 0) {
            String arg = args[0];
            if("xztx01".equals(arg)) {
                Result result = JUnitCore.runClasses(XztxTest.class);
                if(result.wasSuccessful()) {
                    System.out.println("01成功");
                }else {
                    System.out.println("01失败");
                }
            }else if("xztx02".equals(arg)) {
                Result result = JUnitCore.runClasses(XztxTest02.class);
                if(result.wasSuccessful()) {
                    System.out.println("02成功");
                }else {
                    System.out.println("02失败");
                }
            }else if("xztx03".equals(arg)) {
                Result result = JUnitCore.runClasses(XztxTest03.class);
                if(result.wasSuccessful()) {
                    System.out.println("03成功");
                }else {
                    System.out.println("03失败");
                }
            }else if("xztx04".equals(arg)) {
                Result result = JUnitCore.runClasses(XztxTest04.class);
                if(result.wasSuccessful()) {
                    System.out.println("04成功");
                }else {
                    System.out.println("04失败");
                }
            }
        }

    }
}
