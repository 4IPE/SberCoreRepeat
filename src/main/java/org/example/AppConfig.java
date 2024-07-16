package org.example;

import org.example.model.Cat;
import org.example.model.Dog;
import org.example.model.Parrot;
import org.example.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public Parrot parrot1() {
        return new Parrot("Parrot 1");
    }

    @Bean
    public Parrot parrot2() {
        return new Parrot("Parrot 2");
    }

    @Bean
    public Cat cat() {
        return new Cat("Cat");
    }

    @Bean
    public Dog dog() {
        return new Dog("Dog");
    }

    @Bean
    public Person person() {
        return new Person(Arrays.asList(parrot1(), parrot2()), cat(), dog());
    }
}
