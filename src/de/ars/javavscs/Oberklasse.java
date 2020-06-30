package de.ars.javavscs;

public class Oberklasse { // final = keine Unterklassen

    String titel;
    int counter = 5;

    { // Initializer-Block
        counter = 4;
    }

    public Oberklasse() {
        this("titel", 4);
    }

    public Oberklasse(String titel, int counter) {
        this.titel = titel;
        this.counter = counter;
    }

    public Oberklasse(int counter) {
        this.counter = counter;
    }

    public Oberklasse(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void sprechen() { // final = kein Überschreiben
        System.out.println("Hallo Welt");
    }


}
