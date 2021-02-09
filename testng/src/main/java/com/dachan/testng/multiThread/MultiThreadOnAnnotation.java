package com.dachan.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 9:17 PM
 * @version:
 */
public class MultiThreadOnAnnotation {

    private static int count = 0;

    /**
     * invocationCount
     * threadPoolSize
     */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(count++);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
