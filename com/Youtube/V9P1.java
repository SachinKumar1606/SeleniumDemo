package com.Youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class V9P1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement BoxA = driver.findElement(By.xpath("//li[@name='A']"));
        WebElement BoxD = driver.findElement(By.xpath("//li[@name='D']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(BoxA);
        actions.build().perform();
            

    }
}
