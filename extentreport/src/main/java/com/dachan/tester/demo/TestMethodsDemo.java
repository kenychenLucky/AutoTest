package com.dachan.tester.demo;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/8 4:10 PM
 * @version:
 */
public class TestMethodsDemo {

    @Test
    public void testInt() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void testFloat() {
        Assert.assertEquals(1.1,1.1);
    }


    @Test
    public void testString() {
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void testDouble() {
        Assert.assertEquals(new double[1],new double[1]);
    }


    @Test
    public void logDemo() {
        Reporter.log("TestMethodsDemo log");
        throw new RuntimeException("this is Demo Exception");
    }
}
