package com.mainclass;

import com.entity.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.entity.Person;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Person p = context.getBean(Person.class);
        System.out.println(p.makeCall());
    }
}
