package com.OrangeHRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaveApply {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username1 = driver.findElement(By.name("txtUsername"));
        username1.sendKeys("Admin ");
        WebElement userpass1 = driver.findElement(By.name("txtPassword"));
        userpass1.sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//span[text()='Assign Leave']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empName']")).sendKeys("Sachin Kumar");
        WebElement testDropDown = driver.findElement(By.id("assignleave_txtLeaveType"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByValue("9");
        driver.findElement(By.xpath("//input[@id='dropdown.selectByValue(']")).click();
//        driver.findElement(By.xpath("//input[@id='assignleave_txtToDate']")).sendKeys("2022-01-22");
//        WebElement testDropDown1 = driver.findElement(By.id("assignleave_duration_duration"));
//        Select dropdown1 = new Select(testDropDown);
//        dropdown.selectByValue("full_day");
//        driver.findElement(By.id("assignleave_txtComment")).sendKeys("Thanks for the leave.");
//        Thread.sleep(5000);
//        driver.findElement(By.id("assignBtn")).click();
        driver.close();
    }
}
