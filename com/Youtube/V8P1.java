package com.Youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class V8P1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement s = driver.findElement(By.name("q"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys("hello ").keyUp(Keys.SHIFT).sendKeys("all....").perform();
    }
}
