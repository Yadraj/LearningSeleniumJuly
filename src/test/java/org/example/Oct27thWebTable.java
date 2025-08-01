package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Oct27thWebTable {

    @Test
    public void webTable(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        //table[@id='customers']/tbody/tr[2]/td[1]
        String firstPart ="//table[@id='customers']/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        for(int i=2;i<=rows;i++){
            for(int j=1;j<=col;j++){
                String dynamicPath = firstPart+i+secondPart+j+thirdPart;
                String data = driver.findElement(By.xpath(dynamicPath)).getText();
                if(data.contains("Helen")){

                    String country=dynamicPath+"/following-sibling::td";
                    String company=dynamicPath+"/preceding-sibling::td";
                    String country_text = driver.findElement(By.xpath(country)).getText();
                    String company_text = driver.findElement(By.xpath(company)).getText();
                    System.out.println(country_text);
                    System.out.println(company_text);

                }
            }


        }



        driver.quit();

    }
}
