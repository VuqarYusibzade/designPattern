package org.example.structuralpatterns.bridge;

public class Windows implements OperatingSystem {
    @Override
    public void install() {
        System.out.println("Installing Windows operating system...");
    }
}
