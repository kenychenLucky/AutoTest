package com.dachan.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 8:56 PM
 * @version:
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name =" + name +"; age=" + age);
    }


    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"dachan",15},
                {"milk",20},
                {"liuxiang",30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void testDataProvider1(String name,int age){
        System.out.println("testDataProvider1 name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void testDataProvider2(String name,int age){
        System.out.println("testDataProvider2 name="+name+";age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"dachan",20},
                    {"mike",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"mayun",50},
                    {"liuxiang",60}
            };
        }

        return result;
    }

}
