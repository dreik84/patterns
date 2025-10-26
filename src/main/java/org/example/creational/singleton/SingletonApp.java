package org.example.creational.singleton;

public class SingletonApp {
    public static void main(String[] args) {

        Singleton1 singleton1_1 = Singleton1.getInstance();
        Singleton1 singleton1_2 = Singleton1.getInstance();
//        Singleton1 singleton1_3 = new Singleton1();  // error

        Singleton2 singleton2_1 = Singleton2.INSTANCE;
        Singleton2 singleton2_2 = Singleton2.INSTANCE;
//        Singleton2 singleton2_3 = new Singleton2(); // error

        Singleton3 singleton3_1 = Singleton3.INSTANCE;
        Singleton3 singleton3_2 = Singleton3.INSTANCE;
//        Singleton3 singleton3_3 = new Singleton3(); // error

        System.out.println(singleton1_1 == singleton1_2); // true
        System.out.println(singleton2_1 == singleton2_2); // true
        System.out.println(singleton3_1 == singleton3_2); // true
    }
}
