package com.dachan.testng.groups;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 8:34 PM
 * @version:
 */
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1 stu1 run.");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1 stu2 run.");
    }

}
