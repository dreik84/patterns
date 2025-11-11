package org.example.behavioral.strategy.cats;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatSortStrategyApp {
    public static void main(String[] args) {

        Cat adam = new Cat("Adam", 3);
        Cat murzik = new Cat("Murzik", 5);
        Cat keks = new Cat("Keks", 2);
        Cat zorro = new Cat("Zorro", 8);

        List<Cat> cats = new ArrayList<>();
        cats.add(adam);
        cats.add(murzik);
        cats.add(keks);
        cats.add(zorro);

        Comparator<Cat> compareByName = Comparator.comparing(Cat::getName);
        Comparator<Cat> compareByAge = Comparator.comparingInt(Cat::getAge);

        cats.sort(compareByName);
        System.out.println(cats);

        cats.sort(compareByAge);
        System.out.println(cats);
    }
}
