package org.example.modifiers.p1;

public class Derived extends Protection {

    Derived() {
        System.out.println("Конструктор произоводного класса");
        System.out.println("n = " + n);
//        System.out.println("nPri = " + nPri);
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
