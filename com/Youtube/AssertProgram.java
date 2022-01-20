package com.Youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertProgram {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String titAc = driver.getTitle();
        Assert.assertEquals(titAc,"Google");
        System.out.println("Tittle matches");
        driver.close();
    }
}
