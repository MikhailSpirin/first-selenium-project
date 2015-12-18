package com.wix.spirinmikhail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by mikhails on 15.12.2015
 */
public class SecondTaskModuleOneTest {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        driver = TestHelper.getRightDriver();  // TestHelper class - for 6th task
    }

    @AfterClass
    public static void afterClass(){
        driver.quit();
    }

    @Test
    public void firstTitleTest(){
        driver.get("http://comments.azurewebsites.net/");
        assertEquals("Title is wrong", driver.getTitle(), "Index");
    }

    @Test
    public void secondTitleTest(){
        driver.get("http://coinmarketcap.com/");
        assertEquals("Title is wrong", driver.getTitle(), "Crypto-Currency Market Capitalizations");
    }

    @Test
    public void thirdTitleTest(){
        driver.get("http://google.com");
        assertEquals("Title is wrong", driver.getTitle(), "Google");
    }
}

