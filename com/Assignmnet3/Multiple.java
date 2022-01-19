package com.Assignmnet3;
interface Iface1{
    default void show(){
        System.out.println("I am Interface1");
    }
}

interface Iface2{
    default void show(){
        System.out.println("I am Interface2");
    }
}


public class Multiple implements Iface2, Iface1{
    public void show() {
        Iface1.super.show();
        Iface2.super.show();
    }

    public static void main(String[] args) {
        Multiple ml =new Multiple();
        ml.show();
    }
}
