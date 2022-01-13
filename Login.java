import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin");
        WebElement userpass = driver.findElement(By.name("txtPassword"));
        userpass.sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
//        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin ");
//        WebElement userpass = driver.findElement(By.name("txtPassword"));
        userpass.sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.close();
    }
}
