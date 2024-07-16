package org.example.model;

import java.util.List;

public class Person {
    private final List<Parrot> parrots;
    private final Cat cat;
    private final Dog dog;

    public Person(List<Parrot> parrots, Cat cat, Dog dog) {
        this.parrots = parrots;
        this.cat = cat;
        this.dog = dog;
    }

    public List<Parrot> getParrots() {
        return parrots;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }
}
