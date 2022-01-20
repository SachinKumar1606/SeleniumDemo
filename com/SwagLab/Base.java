package com.SwagLab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.asn1.eac.CertificateHolderReference;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Base {
    WebDriver driver;
    void login(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }
    void select(String pName){

        String ExpRes = driver.findElement(By.xpath("//div[@class='inventory_item_name'][contains(text(),"+pName+")]")).getText();
        driver.findElement(By.xpath("//div[@class='inventory_item_name'][contains(text(),"+pName+")]")).click();
        String ActRes = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText();
        Assert.assertEquals(ActRes,ExpRes);
        System.out.println("you r on right page.............");
        System.out.println("Which is : "+pName);
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
    }
    void logout(){
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement xl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout_sidebar_link']")));
        xl.click();
    }
}
