package org.example.model;


import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Parrot";

    public String getName() {
        return name;
    }
}
