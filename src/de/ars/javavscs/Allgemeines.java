package de.ars.javavscs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Allgemeines {

    public static final String SAMPLE = "Hallo"; // Konstante
    public static final List<String> myList = new LinkedList<>(); // keine echte Konstante

    int x;

    /**
     *
     * @return unveränderliche Liste
     */
    private List<String> findText() {
        return findText(4);
    }

    private List<String> findText(int y) {
        this.x = 5;
        return null;
    }

    private void datenTypen() {

        long l = 10000000000L ; // "5" = int
        int i = (int) l;

        char c = 'c';
        c = '\u00fc'; // \n \t
        i = c;

        System.out.println("H" + 3);
        System.out.println('H' + 3); // !

        for (char j = 'a'; j < 'z'; j++) { // Unicode

        }

        // alternative Schreibweisen
        i = 0xa1; // hex
        i = 0b0_0001_0010; // binär
        i =  10; // dezimal
        i = 010; // oktal -> 8
        i = 5 | 4;

        boolean b = "xy" == "xy"; // Identität, KEIN equals(), mal Ja, mal NEin
        b = "xy".equals("xy"); // richtig
        String text = null;
        b = text == null; // nicht mit equals
        b = text == null || text.isEmpty();

        // Wrapperklassen
        Integer ii = 3 ; // ii.intValue()
        Double d = null;
        Character character;
        List<Integer> list = new LinkedList<>(); // notwendig
        list.add(Integer.valueOf(i));  // ausführliche Schreibweise
        list.add(i); // Autoboxing
        i = ii; // Autounboxing (i = ii.intValue()), evtl. NPE!

        boolean initialized2; // Standard, denn kann nicht null sein,
        Boolean initialized; // braucht mehr Speicher, Performance, aber 3. Zustand

        // Type Inference ab Java 9
        var s = "";

        // String Interpolation, keine Variable Interpolation
        String myText = String.format("Das sind %d %s", 3, "Beispiele");

    }

    private static Optional<List<String>> findList() {
        // ...
        return Optional.empty();
        //return Optional.of(new LinkedList<>());
        // return null; // niemals
    }

    public static void main(String[] args) {

        int zusammengesetztesWort = 0;
        int KONSTANTEN_XY = 3;

        // überladener Operator
        int x = 3+4;
        String text = "Hallo " + "Welt";

        // Konstanten
        final int y = 5;
        // y=4; geht nicht

        System.out.println("Hallo" + 123);
        System.out.println("Hallo" + (123 + 456));

        // unveränderliche Liste
        List<String> list2 = Collections.unmodifiableList(new LinkedList<>());
        list2.add("");

        // überschattete Variablen
        List<String> myList = new LinkedList<>();
        Allgemeines.myList.add(""); // Zugriff auf außen

        x = 4; // lokale Variable
        // this.x = 5; // Instanzvariable (wenn Methode nicht static)

        // ohne Optional
        //List<String> result = findList();
        // result?.add(""); gibt es nicht
        //if(null != result) {
        //    result.add("");
        //}

        // mit Optional
        findList().ifPresent(l -> l.add(""));

    }

}
