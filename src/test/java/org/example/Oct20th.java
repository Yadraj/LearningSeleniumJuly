package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Oct20th {

    @Test
    public void ebay() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("macmini");
    driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
    Thread.sleep(10000);
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-item__title']/span"));
    System.out.println(list.size());
    for(WebElement ele : list){
        System.out.println(ele.getText());
    }

        Thread.sleep(10000);

        List<WebElement> list_price = driver.findElements(By.xpath("//span[@class='s-item__price']"));
        System.out.println(list_price.size());
        for(WebElement ele : list_price){
            System.out.println(ele.getText());
        }

    driver.quit();

}



}
