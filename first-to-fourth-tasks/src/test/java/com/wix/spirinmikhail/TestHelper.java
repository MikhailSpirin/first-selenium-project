package com.wix.spirinmikhail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by mikhails on 16.12.2015
 */
public class TestHelper {

    public static WebDriver getRightDriver() {

        FileInputStream configFile;
        Properties properties = new Properties();
        WebDriver driver = null;
        String browser = "";

        try {
            configFile = new FileInputStream("target/test-classes/config.properties");
            properties.load(configFile);
            browser = properties.getProperty("driver.browser");
        } catch (IOException e) {
            System.err.println("Error: There is no config file!");
        }

        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }


        if (driver == null) {  driver = new FirefoxDriver();       }  /// default value - FireFox

        return driver;
    }
}
