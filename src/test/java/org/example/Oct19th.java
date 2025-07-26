package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Oct19th {

    @Test
    public void method() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("yadraj@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("123");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.id("js-notification-box-msg")).getText();
        Assert.assertEquals(text,"Your email, password, IP address or location did not match");
        driver.quit();

    }

}
