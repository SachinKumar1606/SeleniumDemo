package com.SwagLab;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Base b=new Base();
        b.login();
        Thread.sleep(5000);
        b.driver.close();
    }
}
