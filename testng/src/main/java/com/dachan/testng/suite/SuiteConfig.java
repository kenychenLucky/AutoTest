package com.dachan.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 3:17 PM
 * @version:
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite run.");
    }

    @AfterSuite
    public  void aftersuite(){
        System.out.println("aftersuite run.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
