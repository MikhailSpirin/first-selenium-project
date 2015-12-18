package com.wix.spirinmikhail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

/**
 * Created by mikhails on 15.12.2015
 */
public class ThirdTaskTest {

    private WebDriver driver;

    @Before
    public void beforeTest(){
        driver = TestHelper.getRightDriver();  // TestHelper class - for 6th task
    }

    @Test (expected = NoSuchElementException.class)
    public void exceptionExpectedTest(){
        driver.get("http://comments.azurewebsites.net/");

        WebElement dropdown = driver.findElement(By.id("commandSelekt"));   //should fail with NoSuchElementException -
                                                                            //wrong "id" attr
        assertEquals("name is wrong. ", dropdown.getAttribute("name"), "cmdSelect");
    }

    @After
    public void afterTest(){
        driver.quit();
    }

}
