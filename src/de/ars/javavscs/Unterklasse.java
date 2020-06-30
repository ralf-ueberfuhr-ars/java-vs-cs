package de.ars.javavscs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class Unterklasse extends Oberklasse { // Einfachvererbung

    // implizit Erben von java.lang.Object

    int anzahl;

    public Unterklasse() {
        // wenn nichts steht -> implizit super();
        //super("titel", 10); // Konstruktor der Oberklasse
    }

    @Override
    public void sprechen() {
        // jede Methode ist dynamisch gebunden, also überschreibbar
        // außer: static, private, final, Konstruktoren

        //super.sprechen();

        // anonyme Klasse = Unterklasse
        List<String> l = new LinkedList<>() {
            @Override
            public boolean add(String s) {
                return super.add(s.toUpperCase());
            }
        };

        l = new LinkedList<>() {
            {
                add("text");
            }
        };

        // Anwendungsfall Desktop UI mit Swing
        final JFrame f = new JFrame();
        JButton b = new JButton();
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.add(new JTextField()); // Closure
                Unterklasse.this.anzahl = 3;
                anzahl = Math.abs(-4);
            }
        });

        l.add("text");
        l.add(null); // Achtung!

    }
}
