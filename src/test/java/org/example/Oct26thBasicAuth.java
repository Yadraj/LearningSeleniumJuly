package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Oct26thBasicAuth {


    @Test
    public void basicAuth(){

        WebDriver driver = new ChromeDriver();

        String username="admin";
        String password="admin";
        String url = "https://the-internet.herokuapp.com/basic_auth";
        String authenticatedUrl="https://"+username +":" + password + "@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(authenticatedUrl);
        String text = driver.findElement(By.xpath("//p")).getText();
        Assert.assertEquals(text,"Congratulations! You must have the proper credentials.");
        driver.quit();


    }
}
