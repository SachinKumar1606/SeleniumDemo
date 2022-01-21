package com.Youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class V10P1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app/");
        WebElement dp = driver.findElement(By.xpath("//select[@id='owc']"));
        Select sl = new Select(dp);
//        sl.selectByIndex(1);
//        Thread.sleep(1000);
//        sl.selectByVisibleText("Option 2");
//        Thread.sleep(1000);
//        sl.selectByValue("option 3");
//        List<WebElement> allOp = sl.getOptions();
        List<WebElement> allOp = driver.findElements(By.xpath("//select[@id='owc']"));
        for (WebElement op : allOp){
            System.out.println(op.getText());
            if(op.getText().equals("option")) {
                op.click();
            }
        }
        List<WebElement> allOp1 = sl.getAllSelectedOptions();
        for (WebElement op : allOp1){
            System.out.println(op.getText());
        }
        Thread.sleep(1000);
//        driver.close();
    }
}
