package com.Youtube;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class V4P1 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();

        if(driver.getPageSource().contains("You successfully clicked an alert"))
            System.out.println("You successfully clicked an alert");
        System.out.println("================================================");


        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2 = driver.switchTo().alert();
        String text = alert2.getText();
        alert2.dismiss();
        System.out.println(text);

        if(driver.getPageSource().contains("You clicked: Cancel"))
            System.out.println("You clicked: Cancel");
        System.out.println("================================================");

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert3 = driver.switchTo().alert();
        String text1 = alert3.getText();
        alert3.sendKeys("Hello i am active.");
        Thread.sleep(5000);
        alert3.accept();
        System.out.println(text1);

        if(driver.getPageSource().contains("You entered: Hello i am active."))
            System.out.println("You entered: Hello i am active.");
        System.out.println("================================================");

        driver.close();
        driver.quit();
    }
}
