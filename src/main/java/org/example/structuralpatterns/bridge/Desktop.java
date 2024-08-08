package org.example.structuralpatterns.bridge;

public class Desktop extends Computer {
    public Desktop(OperatingSystem os) {
        super(os);
    }
    @Override
    void assemble() {
        System.out.println("Assembling desktop...");
        os.install();
    }
}
