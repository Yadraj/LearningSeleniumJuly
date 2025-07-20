package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium01 {

    @Test
    public void demo(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito-mode");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String text = "CURA Healthcare Service";
        String source = driver.getPageSource();
        Assert.assertTrue(source.contains(text));
        driver.quit();


    }
}
