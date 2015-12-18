package com.wix.spirinmikhail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by mikhails on 15.12.2015
 */
public class SecondTaskModuleTwoTest {

    WebDriver driver;

    @Before
    public void before(){
        driver = TestHelper.getRightDriver();  // TestHelper class - for 6th task
    }

    @After
    public void after(){
        driver.quit();
    }
    
    @Test
    public void firstHTMLContainTest(){
        driver.get("http://comments.azurewebsites.net/");
        assertTrue("There is no HTML tag", driver.getPageSource().contains("<html"));
    }

    @Test
    public void secondHTMLContain(){
        driver.get("http://coinmarketcap.com/");
        assertTrue("There is no HTML tag", driver.getPageSource().contains("<html"));
    }

    @Test
    public void thirdHTMLContain(){
        driver.get("http://google.com");
        assertTrue("There is no HTML tag", driver.getPageSource().contains("<html"));
    }
}
