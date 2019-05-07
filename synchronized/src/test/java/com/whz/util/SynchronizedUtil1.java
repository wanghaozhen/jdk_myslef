package com.whz.util;

/**
 * Created by TOPFEEL on 2019/5/7.
 */
public class SynchronizedUtil1 {
    public static synchronized void method1(){
        System.out.println("SynchronizedUtil1_method1");
    }

    public static synchronized void method2(){
        System.out.println("SynchronizedUtil1_method2");
    }

    public static synchronized void method3(){
        System.out.println("SynchronizedUtil1_method3");
    }
}
