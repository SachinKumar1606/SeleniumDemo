import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Orange {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        String User = "usmer004600";

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Aaliyah Haq");
        driver.findElement(By.id("systemUser_userName")).sendKeys(User);
        driver.findElement(By.id("systemUser_password")).sendKeys("Wel@123come");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Wel@123come");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='addbutton']")).click();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys(User);
        driver.findElement(By.id("searchBtn")).click();
        String msg = driver.findElement(By.id("successBodyEdit")).getText();
        System.out.println(msg);
//        Assert.assertEquals(msg,"Successfully Saved");
//        System.out.println("================================================");
//        Assert.assertTrue(msg.isDisplayed());
//        System.out.println("================================================");
//        Assert.assertEquals("Msg is incorrect", msg, "Successfully Saved");
        System.out.println("================================================");

//        Thread.sleep(5000);
        driver.close();

    }
}
