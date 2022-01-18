package com.OrangeHRM;

import org.openqa.selenium.By;

public class Main extends Base {
    public static void main(String[] args) throws InterruptedException{
        Base bs = new Base();
        String User="User1116";
        bs.login();
//        bs.addUser(User);
//        Thread.sleep(5000);
//        bs.checker(User);
        driver.findElement(By.xpath("//b[text()='Admin']")).click();
        bs.deleteUser(User);
//        bs.logout();
        Thread.sleep(5000);
//        driver.close();
    }

}
