package com.wix.spirinmikhail;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by mikhails on 15.12.2015
 */
public class FifthTaskTest {

    @Test
    public void phantomJSTest() {

        DesiredCapabilities dCaps = new DesiredCapabilities();
        dCaps.setCapability("phantomjs.binary.path",
                "C:\\phantomjs\\bin\\phantomjs.exe"); // bin file need to be placed here

        WebDriver driver = new PhantomJSDriver(dCaps);
        driver.get("http://google.com");
        Assert.assertEquals("Title is wrong.", "Google", driver.getTitle());
    }
}
