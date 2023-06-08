package com.myapp.tests.topics;

import com.myapp.utilities.Driver;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day18_FirstDriverTest {
//    Create FirstDriverTest class
//    Go to amazon page

    @Test
    public void firstDriverTest(){
   //     driver.get("https://www.amazon.com");
        Driver.getDriver().get("https://www.amazon.com");

        //    Verify the title includes amazon
  //      driver.getTitle();
        String actualTitle = Driver.getDriver().getTitle();
        // assert actualTitle.contains("amazon")
        Assert.assertTrue(actualTitle.toLowerCase().contains("amazon"));


        // closing the driver
        // driver.quit();
        Driver.closeDriver();

    }
}
