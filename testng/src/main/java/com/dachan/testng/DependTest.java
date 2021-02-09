package com.dachan.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 8:47 PM
 * @version:
 */
public class DependTest {

    @Test
    public void testByMothed(){
        System.out.println("testByMothed Run");
        throw new RuntimeException();
    }



    @Test(dependsOnMethods = {"testByMothed"})
    public void test(){
        System.out.println("test run");
    }
}
