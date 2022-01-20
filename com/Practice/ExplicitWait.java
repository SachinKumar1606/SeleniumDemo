package com.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'WebDriver')]")));
//        WebElement elm = driver.findElement(By.xpath("//p[contains(text(),'WebDriver')]"));
        boolean status = ele.isDisplayed();
        if(status){
            System.out.println("WebDriver is displayed");
        }else{
            System.out.println("Sorry no WebDriver is displayed");
        }
    }
}
