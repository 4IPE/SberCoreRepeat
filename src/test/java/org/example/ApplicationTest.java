// ApplicationTest.java
package com.example;

import org.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationTest {

    @Test
    public void testContextLoads() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean(Person.class);
        assertNotNull(person);
        assertNotNull(person.getParrots());
        assertNotNull(person.getCat());
        assertNotNull(person.getDog());
    }
}
