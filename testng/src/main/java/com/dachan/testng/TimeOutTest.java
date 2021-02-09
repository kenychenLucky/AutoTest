package com.dachan.testng;

import org.testng.annotations.Test;

import java.sql.Time;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 10:08 PM
 * @version:
 */
public class TimeOutTest {

    /**
     * @Test(timeOut = millis)
     * @throws InterruptedException
     */

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFail() throws InterruptedException {
        Thread.sleep(3000);
    }
}
