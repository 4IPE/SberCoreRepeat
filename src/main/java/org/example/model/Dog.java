package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Dog";

    public String getName() {
        return name;
    }
}
