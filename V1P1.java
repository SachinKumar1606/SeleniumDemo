import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class V1P1 {
    public static void main(String[] args) throws InterruptedException, IOException {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/SachinKumar/Desktop/Helping files/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.chromedriver().driverVersion("98.0.4577.63").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.get("https://google.com");
//        driver.navigate().to("https://google.com");
//        String org = driver.getWindowHandle();
//        driver.get("https://jar-download.com/artifact-search/webdrivermanager");
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.switchTo().window(org);
//        driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//        driver.switchTo().frame("classFrame");
//        driver.findElement(By.linkText("org.openqa.selenium")).click();
//        webElement.click();
      /*  Thread.sleep(5000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium.concurrent")).click();
        Thread.sleep(5000); */
//        int wid=driver.manage().window().getSize().getWidth();
//        int hei=driver.manage().window().getSize().getHeight();
//        Dimension size = driver.manage().window().getSize();
//        int wid = size.getWidth();
//        int hei = size.getHeight();
//        driver.manage().window().setSize(new Dimension(800,600));
//        Thread.sleep(4000);
        /*
        Point pos = driver.manage().window().getPosition();
        driver.manage().window().setPosition(new Point(50,100));
        Thread.sleep(4000);
        driver.close();
        System.out.println("Width is: "+wid);
        System.out.println("Height is: "+hei);
        System.out.println(pos.getX());
        System.out.println(pos.getY());
        */
//        driver.quit();
        /*
    driver.manage().window().minimize();
    Thread.sleep(4000);
    driver.manage().window().maximize();
    Thread.sleep(4000);
    driver.manage().window().fullscreen();
    Thread.sleep(4000);
    driver.close();
         */
//        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcFile,new File("./image1.png"));
        driver.get("https://google.com");
//        WebElement ele = driver.findElement(By.cssSelector(".lnXdpd"));
//        File srcFile1 = ele.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcFile1,new File("./image2.png"));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement button = driver.findElement(By.name("btnI"));

        js.executeScript("arguments[0].click();",button);
        Thread.sleep(5000);
        driver.close();
    }
}
