import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Wait1 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.findElement(By.xpath("//select[@id='first']")).click();
        driver.findElement(By.xpath("//option[@value='Apple']")).click();
        driver.findElement(By.xpath("//select[@id='animals']")).click();
        driver.findElement(By.xpath("//option[@value='avatar']")).click();
        driver.close();
        driver.quit();

    }
}
