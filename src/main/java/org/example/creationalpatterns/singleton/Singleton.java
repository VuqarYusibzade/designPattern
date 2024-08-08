package org.example.creationalpatterns.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public int multiply( int num1, int num2) {
        return (num1*num2)/2;

    }
    public void printString(String message) {
        System.out.println("Message: " + message);
    }
}
