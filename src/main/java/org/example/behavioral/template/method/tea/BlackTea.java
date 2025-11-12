package org.example.behavioral.template.method.tea;

public class BlackTea extends Tea {

    @Override
    protected void boiledWater() {
        System.out.println("Греем воду до 100 градусов");
    }
}
