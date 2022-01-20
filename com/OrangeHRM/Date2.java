package com.OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

import java.time.Duration;

public class Date2 {
    public static void main(String[] args) throws InterruptedException {
        String MM = "March";
        String YY = "2024";
        String day = "30";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.globalsqa.com/demo-site/datepicker/");
        driver.switchTo().frame(0);
//        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(2000);
        while(true) {
            String txt = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            System.out.println(txt);
            if (txt.equals(MM)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        while(true) {
            String txt2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            System.out.println(txt2);
            if(txt2.equals(YY)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),"+day+")]")).click();
    }
}
