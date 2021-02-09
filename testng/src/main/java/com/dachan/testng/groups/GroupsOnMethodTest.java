package com.dachan.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Description:
 * @author: kenychen
 * @Date: 2021/1/6 10:35 AM
 * @version:
 */
public class GroupsOnMethodTest {

    @Test(groups = "server")
    public void testServer1() {
        System.out.println("testServer1 test1");
    }

    @Test(groups = "server")
    public void testServer2() {
        System.out.println("testServer2 test1");
    }

    @Test(groups = "client")
    public void testClient1() {
        System.out.println("testClient1 test1");
    }

    @Test(groups = "client")
    public void testClient2() {
        System.out.println("testClient2 test2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("beforeGroupsOnServer run.");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("afterGroupsOnServer run.");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("beforeGroupsOnClient run.");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("afterGroupsOnClient run.");
    }
}


