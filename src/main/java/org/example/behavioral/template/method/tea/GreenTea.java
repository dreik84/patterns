package org.example.behavioral.template.method.tea;

public class GreenTea extends Tea {

    @Override
    protected void boiledWater() {
        System.out.println("Греем воду до 85 градусов");
    }
}
