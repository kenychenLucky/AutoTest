package com.dachan.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 10:07 AM
 * @version:
 */
public class IgnoreTest {

    @Test
    public void ignore1() {
        System.out.println("ignore1 Test run...");
    }

    @Test(enabled = false)
    public void ignoreEnabledFalse() {
        System.out.println("ignoreEnabledFalse run...");
    }

    @Test(enabled = true)
    public void ignoreEnabledTrue() {
        System.out.println("ignoreEnabledTrue run...");
    }
}
