package org.example.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {
    private List<Parrot> parrots;
    private Cat cat;
    private Dog dog;

    @Autowired
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
