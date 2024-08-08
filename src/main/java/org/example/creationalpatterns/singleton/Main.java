package org.example.creationalpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        int result = singleton.multiply(5, 10);
        System.out.println(result);

        singleton.printString("Btane snkrs, btane cbk kraker , btanede baty");

    }
}

