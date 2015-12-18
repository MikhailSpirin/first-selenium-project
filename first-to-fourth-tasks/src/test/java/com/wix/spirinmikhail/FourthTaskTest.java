package com.wix.spirinmikhail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

/**
 * Created by mikhails on 15.12.2015
 */
public class FourthTaskTest {

    @Test  (timeout = 10500)
    public void timeoutExpectedTest(){
        WebDriver driver = TestHelper.getRightDriver();  // TestHelper class - for 6th task
        driver.get("http://google.com");

         driver.findElement(By.name("btnI")).click();
         WebElement languageMenu = driver.findElement(By.id("language-menu"));

         assertTrue("Language menu is not present", languageMenu.isDisplayed());

         driver.quit();
    }
}
