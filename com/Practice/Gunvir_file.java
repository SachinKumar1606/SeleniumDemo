package com.Practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class Gunvir_file {
    public static void main(String args[]) throws InterruptedException, MalformedURLException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String bookingdate = "21-November-2022";
        String[] temp = bookingdate.split("-");
        String date = temp[0];
        String month = temp[1];
        String year = temp[2];

        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-mode,'checkin')]"))).click();

        String leftMonth_WithYear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bui-calendar__month"))).getText();
        String[] G = leftMonth_WithYear.split(" ");
        String leftNewMonth = G[0];
        String leftNewYear = G[1];

        while (true) {
            if (driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[2]")).getText().split("\\ ")[0].equals(month) && driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[2]")).getText().split("\\ ")[1].equals(year)) {
                break;
            } else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-bui-ref, 'calendar-next')]//*[name()='svg']"))).click();
                Thread.sleep(500);
            }
        }

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='bui-calendar__month'])[2]"))).getText());
        Thread.sleep(2000);
        driver.close();
    }
}
