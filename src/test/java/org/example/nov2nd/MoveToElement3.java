package org.example.nov2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MoveToElement3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        WebElement popup = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        popup.click();

        WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']/input"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(from).click().sendKeys("del").perform();
        Thread.sleep(2000);
        actions.moveToElement(from).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
        Thread.sleep(2000);
    }
}
