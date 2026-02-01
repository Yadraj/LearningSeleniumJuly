package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PartialSS {

    @Test
    public void pss() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//input[@id=\"name\"]"));
        element.sendKeys("screenshot");
        File src = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Lenovo\\IdeaProjects\\LearningSeleniumJuly\\screenshot\\pss.png"));
        driver.quit();

    }
}
