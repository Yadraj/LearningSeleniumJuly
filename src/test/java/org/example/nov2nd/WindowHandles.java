package org.example.nov2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        String parentWindow= driver.getWindowHandle();
        System.out.println(parentWindow);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> set = driver.getWindowHandles();
        for(String se : set){
            driver.switchTo().window(se);
            if(driver.getPageSource().contains("New")){
                System.out.println("Test Passed");
                break;
            }
        }

        driver.quit();

    }
}
