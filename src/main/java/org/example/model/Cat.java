package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Cat";

    public String getName() {
        return name;
    }
}
