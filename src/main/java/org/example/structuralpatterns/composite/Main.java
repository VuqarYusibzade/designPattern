package org.example.structuralpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Department engineering = new Department("Engineering");
        Department sales = new Department("Sales");
        Employee vugar = new Employee("Vugar");
        Employee nijat = new Employee("Nijat");
        Employee tural = new Employee("Tural");

        engineering.add(vugar);
        engineering.add(nijat);
        sales.add(tural);

        engineering.showDetails();
        sales.showDetails();
    }
}