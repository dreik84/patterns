package org.example.behavioral.template.method.tea;

public class Tea {

    public void make() {
        System.out.println("Насыпать чай");
        boiledWater();
        System.out.println("Подождать пока завариться");
        System.out.println("Разлить по чашкам");
    }

    protected void boiledWater() {
    }
}
