import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class V1P1 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/SachinKumar/Desktop/Helping files/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(1));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://google.com");
//        driver.close();
    }
}
