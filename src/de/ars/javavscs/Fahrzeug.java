package de.ars.javavscs;

import java.util.Collection;

public interface Fahrzeug {

    int STANDARD_LEISTUNG = 100;

    void fahren();

    default void hupe() { // ab Java 8
        ausgabe("huuup!");
    }

    static void doSth() { // Static Method (ab Java 9)
        // ...
    }

    private void ausgabe(String text) { // ab Java 9
        System.out.println(text);
    }

}
