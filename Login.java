import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Driver{
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
}


class Base extends Driver{

    void login(){


        driver = new ChromeDriver();
        driver = driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }

}



public class Login extends Base{

    public static void main(String[] args) throws InterruptedException{
        Base bs = new Base();

        bs.login();


        driver.close();
    }
}
