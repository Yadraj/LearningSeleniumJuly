package org.example.nov2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MoveToElement2 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        WebElement popup = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        popup.click();
        Thread.sleep(2000);

        WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']/input"));
        Actions actions = new Actions(driver);
        actions.moveToElement(from).click().build().perform();

        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div/div/div/div/p"));
        for(WebElement e : list){
            if(e.getText().contains("Pune")){
                e.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
