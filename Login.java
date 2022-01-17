import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login<pubic> {
    public static void login(){
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username1 = driver.findElement(By.name("txtUsername"));
        username1.sendKeys("Admin ");
        WebElement userpass1 = driver.findElement(By.name("txtPassword"));
        userpass1.sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }
    public static void logout() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        login();

        driver.close();
    }
}
