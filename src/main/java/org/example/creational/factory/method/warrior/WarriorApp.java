package org.example.creational.factory.method.warrior;

public class WarriorApp {
    public static void main(String[] args) {

        Warrior archer = Warrior.create(Warriors.ARCHER);
        Warrior horseman = Warrior.create(Warriors.HORSEMAN);
        Warrior knight = Warrior.create(Warriors.KNIGHT);

        System.out.println(archer.getClass());
        System.out.println(horseman.getClass());
        System.out.println(knight.getClass());
    }
}
