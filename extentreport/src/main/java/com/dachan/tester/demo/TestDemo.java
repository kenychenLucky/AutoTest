package com.dachan.tester.demo;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/8 4:51 PM
 * @version:
 */
public class TestDemo {

    @Test
    public void test() {
        int i = 10/0;
    }

    @Test
    public void testI() {
        int i = 10/10;
    }
}
