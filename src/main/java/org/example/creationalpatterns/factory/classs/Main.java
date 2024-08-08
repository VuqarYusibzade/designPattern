package org.example.creationalpatterns.factory.classs;

import org.example.creationalpatterns.factory.implement.Car;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getCar("SUV");
        car1.drive();
        Car car2 = carFactory.getCar("SEDAN");
        car2.drive();
        Car car3 = carFactory.getCar("TRUCK");
        car3.drive();
    }
}
