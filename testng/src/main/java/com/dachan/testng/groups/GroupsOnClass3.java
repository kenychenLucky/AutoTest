package com.dachan.testng.groups;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 8:37 PM
 * @version:
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3 teacher1 run.");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3 teacher2 run.");
    }
}
