package org.example.creationalpatterns.factory.classs;

import org.example.creationalpatterns.factory.implement.Car;

public class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Sedan.");
    }
}