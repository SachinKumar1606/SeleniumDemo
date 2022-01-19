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

        String User = "usmer"+ (int)(Math.random()*(99999-1001)+1000);

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
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@class='addbutton']")).click();
        Thread.sleep(1000);
//        WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'Successfully Saved')]"));
        //Assert value.....................
        Boolean msg = driver.getPageSource().contains("Successfully Saved");
        Assert.assertTrue(msg);
        System.out.println("================================================");
        System.out.println(msg);
        System.out.println("================================================");
        // String msg = driver.findElement(By.id("successBodyEdit")).getText();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys(User);
        driver.findElement(By.id("searchBtn")).click();
//        Assert.assertEquals(msg,"Successfully Saved");
//        Assert.assertTrue(msg.isDisplayed());
//        System.out.println("================================================");
//        Assert.assertEquals("Msg is incorrect", msg, "Successfully Saved");

//        Thread.sleep(5000);
        driver.close();

    }
}
