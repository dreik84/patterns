package org.example.modifiers.p1;

public class SamePackage {

    SamePackage() {
        Protection p = new Protection();

        System.out.println("Конструктор класса из того же пакета");
        System.out.println("n = " + p.n);
//        System.out.println("nPri = " + p.nPri);
        System.out.println("nPro = " + p.nPro);
        System.out.println("nPub = " + p.nPub);
    }
}
