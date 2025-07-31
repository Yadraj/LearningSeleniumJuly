package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Oct26th {

    @Test
    public void alerts() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(text,"You successfully clicked an alert");



        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        String text2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(text2,"You clicked: Ok");


        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        String text3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(text3,"You entered: Hello");

        driver.quit();


    }
}
