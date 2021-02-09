package com.dachan.testng;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class WebAutoListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {

        String methodName = tr.getMethod().getMethodName() + System.currentTimeMillis();
        takeScreenShot(methodName);
    }

    @Attachment(value = "Failure in method {0}", type = "image/png")
    private byte[] takeScreenShot(String methodName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTester.getDriver();
        File screenFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenFile, new File("./screenShort/" + methodName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
    }

}
