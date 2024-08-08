package org.example.structuralpatterns.bridge;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    void assemble() {
        System.out.println("Assembling laptop...");
        os.install();
    }
}