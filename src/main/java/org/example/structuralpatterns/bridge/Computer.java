package org.example.structuralpatterns.bridge;

abstract class Computer {
    protected OperatingSystem os;
    public Computer(OperatingSystem os) {
        this.os = os;
    }
    abstract void assemble();
}