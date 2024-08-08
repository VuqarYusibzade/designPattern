package org.example.structuralpatterns.bridge;

public class MacOS implements OperatingSystem {
    @Override
    public void install() {
        System.out.println("Installing MacOS operating system...");
    }
}
