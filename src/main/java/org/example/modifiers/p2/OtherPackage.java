package org.example.modifiers.p2;

import org.example.modifiers.p1.Protection;

public class OtherPackage {

    OtherPackage() {
        Protection p = new Protection();

        System.out.println("Конструктор класса из другого пакета");
//        System.out.println("n = " + p.n);
//        System.out.println("nPri = " + p.nPri);
//        System.out.println("nPro = " + p.nPro);
        System.out.println("nPub = " + p.nPub);
    }
}
