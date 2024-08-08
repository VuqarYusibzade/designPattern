package org.example.structuralpatterns.composite;

public class Employee implements Component {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("Employee: " + name);
    }
}
