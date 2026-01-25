package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NestedFrames {

    @Test
    public  void nested(){

        WebDriver driver = new ChromeDriver();
        driver.get(" https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        String text = driver.findElement(By.xpath("//div[@id='content']")).getText();
        System.out.println(text);
        driver.quit();
    }
}
