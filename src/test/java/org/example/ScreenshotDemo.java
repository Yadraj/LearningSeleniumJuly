package org.example;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {

    @Test(groups = {"smoke"})
    public void ss() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Lenovo\\IdeaProjects\\LearningSeleniumJuly\\screenshot\\ss.png"));
        driver.quit();

    }
}
