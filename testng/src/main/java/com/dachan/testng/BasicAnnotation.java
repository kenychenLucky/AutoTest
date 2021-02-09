package com.dachan.testng;

import org.testng.annotations.*;

/**
 * @Description:
 *
 * @author: kenychen
 * @Date: 2021/1/6 10:52 AM
 * @version:
 *
 *
 */
public class BasicAnnotation {
    @Test
    public void testCase01() {
        System.out.println("base test run...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
