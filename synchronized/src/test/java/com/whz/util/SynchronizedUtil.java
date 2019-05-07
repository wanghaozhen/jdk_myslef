package com.whz.util;

/**
 * Created by TOPFEEL on 2019/5/7.
 */
public class SynchronizedUtil {
    public static synchronized void method1() throws InterruptedException {
        for(int i=1;i<1000;i++)
        {
            System.out.println("SynchronizedUtil_method1"+i);
            Thread.sleep(1000);
        }

    }

    public static synchronized void method2() throws InterruptedException {
        for(int i=1;i<1000;i++){
            System.out.println("SynchronizedUtil_method2");
            Thread.sleep(500);
        }

    }

    public static synchronized void method3(){
        System.out.println("SynchronizedUtil_method3");
    }
}
