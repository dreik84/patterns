package org.example.creational.factory.method.weapon;

public class WeaponApp {
    public static void main(String[] args) {

        Warrior archer = new Archer();
        Weapon bow = archer.getWeapon();

        System.out.println(archer.getClass());
        System.out.println(bow.getClass());
    }
}
