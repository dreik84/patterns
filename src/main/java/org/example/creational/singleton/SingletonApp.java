package org.example.creational.singleton;

public class SingletonApp {
    public static void main(String[] args) {

        Singleton1 singleton1_1 = Singleton1.getInstance();
        Singleton1 singleton1_2 = Singleton1.getInstance();
//        Singleton1 singleton1_3 = new Singleton1();  // error

        System.out.println(singleton1_1 == singleton1_2); // true
    }
}
