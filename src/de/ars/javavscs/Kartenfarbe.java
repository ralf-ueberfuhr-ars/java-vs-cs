package de.ars.javavscs;

@TollerCode
public enum Kartenfarbe  {

    // public static final Kartenfarbe KREUZ = new Kartenfarbe();

    KARO(9), HERZ(10), PIK(11), KREUZ(12);

    private final int wert;

    private Kartenfarbe(int wert) {
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }

    // -------------------------------------------------------

    public static void main(String[] args) {

        Kartenfarbe k = Kartenfarbe.PIK;
        int wert = Kartenfarbe.HERZ.getWert();
        int ordinal = Kartenfarbe.PIK.ordinal();
        Kartenfarbe herz = Kartenfarbe.valueOf("HERZ");

        // Vergleich
        if(k.equals(Kartenfarbe.KREUZ)) {

        }
        if(k == Kartenfarbe.KREUZ) { // okay

        }

        // enum: privater Konstruktor, Literale = Konstanten (public static final), Vererbung zu java.lang.Enum
        // --> immer dieselbe Instanz pro Literal
        // --> immutable

    }

}
