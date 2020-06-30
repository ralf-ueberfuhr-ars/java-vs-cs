package de.ars.javavscs;

public class ObjekteUndKlassen {

    // Sichtbarkeitsbereiche:
    //  -> Standard = package-protected
    //  -> protected = sichtbar in den Unterklasse + im gleichen Package

    private String titel;
    private boolean isInitialized;
    private Boolean isInitialized2;

    String getTitel() {
        return titel;
    }

    void setTitel(String titel) { // Java Bean Conventions
        this.titel = titel;
    }

    public boolean isInitialized() { // is oder has
        return isInitialized;
    }

    public void setInitialized(boolean initialized) {
        isInitialized = initialized;
    }

    public Boolean getInitialized2() { // get
        return isInitialized2;
    }

    public void setInitialized2(Boolean initialized2) {
        isInitialized2 = initialized2;
    }


    public static void main(String[] args) {

        ObjekteUndKlassen o = new ObjekteUndKlassen();
        o.setTitel(3);

    }

}
