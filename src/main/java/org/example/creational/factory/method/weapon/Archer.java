package org.example.creational.factory.method.weapon;

public class Archer extends Warrior {
    @Override
    public Weapon getWeapon() {
        return new Bow();
    }
}
