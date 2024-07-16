// ApplicationTest.java
package com.example;

import org.example.AppConfig;
import org.example.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationTest {

    @Test
    public void testContextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean(Person.class);
        assertNotNull(person);
        assertNotNull(person.getParrots());
        assertNotNull(person.getCat());
        assertNotNull(person.getDog());
    }
}
