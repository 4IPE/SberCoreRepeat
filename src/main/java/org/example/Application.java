package org.example;


import org.example.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.model");
        Person person = context.getBean(Person.class);
        System.out.println("Person has " + person.getParrots().size() + " parrots, a cat named " + person.getCat().getName() + ", and a dog named " + person.getDog().getName());
    }
}
