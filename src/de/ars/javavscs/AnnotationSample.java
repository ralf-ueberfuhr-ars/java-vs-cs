package de.ars.javavscs;

public class AnnotationSample {

    public static void main(String[] args) {
        System.out.println(isTollerCode(Kartenfarbe.class));
        System.out.println(isTollerCode(Himmelsrichung.class));
    }

    private static boolean isTollerCode(Class<?> c) {
        return null != c.getAnnotation(TollerCode.class);
    }

}
