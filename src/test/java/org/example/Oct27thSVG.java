package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Oct27thSVG {
    WebDriver driver;

    @BeforeTest
    public void init(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void svg() throws InterruptedException {

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("macmini");
        List<WebElement> svgList =driver.findElements(By.xpath("//*[name()='svg']"));
        svgList.get(0).click();
        Thread.sleep(3000);


    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
