package com.dachan.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 8:42 PM
 * @version:
 */
public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("runTimeExceptionFailed");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("runTimeExceptionSuccess");
        int i = 10/0;
    }
}
