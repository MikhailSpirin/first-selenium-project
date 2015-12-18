package com.wix.spirinmikhail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by mikhails on 14.12.2015
 */

public class FirstTaskTest {

    private FirefoxDriver driver1;
    private ChromeDriver driver2;

    @Before
    public void beforeTest() {
        driver1 = new FirefoxDriver();
        driver2 = new ChromeDriver();
    }

    @Test
    public void verifyPageSourceIsTheSameTest(){
        driver1.get("http://comments.azurewebsites.net/");
        driver2.get("http://comments.azurewebsites.net/");

        String fireFoxPageSource = driver1.getPageSource();
        String chromePageSource = driver2.getPageSource();

        assertNotEquals("Page sources is different. ", fireFoxPageSource, chromePageSource);
    }

    @After
    public void afterTest() {
        driver1.quit();
        driver2.quit();
    }
}
