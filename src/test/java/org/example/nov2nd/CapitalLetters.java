package org.example.nov2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CapitalLetters {

    @Test
    public void capital() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        WebElement ele = driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(ele,"Yadraj").keyDown(Keys.SHIFT).build().perform();
        Thread.sleep(2000);
        driver.quit();

    }
}
