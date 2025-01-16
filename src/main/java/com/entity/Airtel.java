package com.entity;

import org.springframework.stereotype.Component;

//By default spring provide Id's to the beans
//Id's are lowercase bean name i.e. for Airtel->airtel
@Component
public class Airtel implements Sim {
    public String calling() {
        return "Calling from Airtel";
    }
}
