package com.OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Base {
    static WebDriver driver;
    void login(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }

    void logout(){
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

    }

    void addUser(String UserId) throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Aaliyah Haq");
        driver.findElement(By.id("systemUser_userName")).sendKeys(UserId);
        driver.findElement(By.id("systemUser_password")).sendKeys("Wel@123come");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Wel@123come");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@class='addbutton']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        String txt = driver.findElement(By.id("successBodyEdit")).getText();
//        Assert.assertEquals(txt,"");
        System.out.println(txt);
        System.out.println("User Created successfully......");
//        driver.findElement(By.xpath("//input[@class='addbutton']")).click();
    }

    void checker(String UserId){

        driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(UserId);
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
//        String txt = driver.findElement(By.xpath("//td[@xpath='1']")).getText();
//        System.out.println(txt);
//        if(txt.equals("No Records Found"))
//            System.out.println("No Records Found");
//        else
//            System.out.println("User Find");
    }

    void deleteUser(String UserId) throws InterruptedException{
        checker(UserId);
        driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectAll']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
    }


}
