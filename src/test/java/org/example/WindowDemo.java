package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowDemo {

    @Test
    public void windowDemo(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        String text = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ")[1].split(" ")[0];
        driver.switchTo().window(parentID);
        driver.findElement(By.id("username")).sendKeys(text);
        driver.quit();

    }
}
