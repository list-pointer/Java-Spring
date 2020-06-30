package com.mavenappusingannoation.mavenappusingannoation;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("com.mavenappusingannoation.mavenappusingannoation.Car Drive");
    }
}
