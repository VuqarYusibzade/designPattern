package org.example.structuralpatterns.bridge;

public class Main {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows();
        OperatingSystem macos = new MacOS();

        Computer laptop = new Laptop(windows);
        Computer desktop = new Desktop(macos);

        laptop.assemble();
        desktop.assemble();
    }
}