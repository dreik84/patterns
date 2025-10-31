package org.example.creational.factory.method.warrior;

abstract class Warrior {

    public static Warrior create(Warriors type) {

        return switch (type) {
            case ARCHER -> {
                yield new Archer();
            }
            case HORSEMAN -> {
                yield new Horseman();
            }
            case KNIGHT -> {
                yield new Knight();
            }
        };
    }
}
