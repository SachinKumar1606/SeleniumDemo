package com.SwagLab;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Base b=new Base();
        String pName = "'Sauce Labs Bike Light'";
//        System.out.println("//div[@class='inventory_item_name'][contains(text(),"+pName);
        b.login();
        b.select(pName);
        Thread.sleep(2000);
        b.logout();
        Thread.sleep(2000);
        b.driver.close();
    }
}
