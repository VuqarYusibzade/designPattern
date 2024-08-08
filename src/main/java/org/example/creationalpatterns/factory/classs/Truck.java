package org.example.creationalpatterns.factory.classs;

import org.example.creationalpatterns.factory.implement.Car;

public class Truck implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Truck.");
    }
}