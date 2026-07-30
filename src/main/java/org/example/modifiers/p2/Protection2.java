package org.example.modifiers.p2;

import org.example.modifiers.p1.Protection;

public class Protection2 extends Protection {

    Protection2() {
        System.out.println("Конструктор производного класса из другого пакета");
//        System.out.println("n = " + n);
//        System.out.println("nPri = " + nPri);
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
