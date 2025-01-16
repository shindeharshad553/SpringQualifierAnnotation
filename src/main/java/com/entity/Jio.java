package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {
    @Override
    public String calling() {
        return "Calling from Jio";
    }
}
