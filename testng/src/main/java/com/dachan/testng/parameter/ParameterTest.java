package com.dachan.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 8:50 PM
 * @version:
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest(String name,int age){
        System.out.println("name = " + name + ";  age = " + age);
    }
}
