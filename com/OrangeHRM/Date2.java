package com.OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Date2 {

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }



    public static void main(String[] args) throws InterruptedException {

        /*
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(2022, 2023);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);


        int mm = (gc.get(gc.MONTH) + 1);
        String MM=null;

        switch(mm){
            case 1:  MM = "January";
                break;
            case 2:  MM = "February";
                break;
            case 3:  MM = "March";
                break;
            case 4:  MM = "April";
                break;
            case 5:  MM = "May";
                break;
            case 6:  MM = "June";
                break;
            case 7:  MM = "July";
                break;
            case 8:  MM = "August";
                break;
            case 9:  MM = "September";
                break;
            case 10: MM = "October";
                break;
            case 11: MM = "November";
                break;
            case 12: MM = "December";
                break;
            default: MM = "Invalid month";
                break;
        }
//        System.out.println(gc.get(gc.YEAR) + "-" + MM + "-" + gc.get(gc.DAY_OF_MONTH));

        String YY = String.valueOf(gc.get(gc.YEAR));
        String day = String.valueOf(gc.get(gc.DAY_OF_MONTH));
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a date (dd-month-yyyy): ");
        String date = sc.nextLine();

        String[] dt = date.split("-", 3);
        String day = dt[0];
        String MM = dt[1];
        String YY = dt[2];


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
//        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.globalsqa.com/demo-site/datepicker/");
        driver.switchTo().frame(0);
//        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(2000);
        while(true) {
            String txt = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//            System.out.println(txt);
            if (txt.equals(MM)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        while(true) {
            String txt2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//            System.out.println(txt2);
            if(txt2.equals(YY)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),"+day+")]")).click();


    }
}
