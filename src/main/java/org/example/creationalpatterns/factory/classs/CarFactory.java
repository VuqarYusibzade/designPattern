package org.example.creationalpatterns.factory.classs;

import org.example.creationalpatterns.factory.implement.Car;

public class CarFactory {
    public Car getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else if (carType.equalsIgnoreCase("SEDAN")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        }
        return null;
    }
}
