
package com.mete.yunus.stf.test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by yunusm on 08.11.2016.
 */
public class AppiumTest {

   private AppiumDriver<WebElement> driver;

   public void setUp() throws Exception {
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("deviceName", "Android Emulator");
      capabilities.setCapability("platformVersion", "6.0");
      capabilities.setCapability("app", "/Users/netas_app/Downloads/StateTest.apk");
      driver = new AndroidDriver<>(new URL("http://10.254.18.17:4723/wd/hub"), capabilities);
   }

   public void tearDown() {
      driver.quit();
   }

   public void apiDemo() {
      WebElement element = driver.findElement(By.id("test.state.netas.com.statetest:id/bt_state2"));
      element.click();
   }

   public void startTest(String udid) {
      try {
         setUp();
         apiDemo();
         tearDown();
      }
      catch (Exception e) {
         e.printStackTrace();
      }

   }

}
