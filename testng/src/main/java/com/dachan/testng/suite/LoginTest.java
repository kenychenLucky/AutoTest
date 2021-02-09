package com.dachan.testng.suite;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 3:15 PM
 * @version:
 */
public class LoginTest {

    @Test
    public void loginTaoBao() {
        System.out.println("login taobao Success!");
    }


    @Test
    public void loginBaidu() {
        System.out.println("login baidu Success!");
    }
}
