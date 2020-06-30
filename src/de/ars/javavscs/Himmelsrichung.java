package de.ars.javavscs;

public enum Himmelsrichung {

    NORD {
        @Override
        public Himmelsrichung getGegenrichtung() {
            return null;
        }
    },
    OST {
        @Override
        public Himmelsrichung getGegenrichtung() {
            return null;
        }
    },
    SÜD {
        @Override
        public Himmelsrichung getGegenrichtung() {
            return null;
        }
    },
    WEST {
        @Override
        public Himmelsrichung getGegenrichtung() {
            return null;
        }
    };

    public abstract Himmelsrichung getGegenrichtung();

}
