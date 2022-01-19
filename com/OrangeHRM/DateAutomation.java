package com.OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAutomation {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String month="March 2022";
        String day = "30";
        driver.navigate().to("https://www.phptravels.net/hotels");
        driver.findElement(By.xpath("//input[@id='checkin']")).click();
        Thread.sleep(2000);
        while(true) {
            String txt = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
            System.out.println(txt);
            if(txt.equals(month)){
                break;
            }
            driver.findElement(By.xpath("(//table[@class=' table-condensed'])[1]//th[@class='next']")).click();
        }
        driver.findElement(By.xpath("(//table[@class=' table-condensed'])[1]//tr//td[@class='day '][contains(text(),'29')]")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
