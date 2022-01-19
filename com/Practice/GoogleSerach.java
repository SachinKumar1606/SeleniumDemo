
package com.Practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSerach {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("https://www.tutorialspoint.com/index.htm");
        search.sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//h3[contains(text(),'Tutorialspoint')]")).click();
        WebElement el = driver.findElement(By.name("key"));
        el.sendKeys("Java");
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[2]/div[1]/button[1]/*[1]")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
