package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    @Autowired  //field level dependency injection using Annotation
    @Qualifier("airtel")   //@Qualifier tells the spring that refer the s to the airtel bean
    private Sim s;

    public String makeCall() {
        return s.calling();
    }
}
