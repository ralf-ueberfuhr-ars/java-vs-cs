package de.ars.javavscs;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaSample {

    // Immediate Evaluation
    private static double summarize(double d1, double d2) {
        return d1+d2;
    }

    // Deferred Evaluation

    @FunctionalInterface
    private static interface DoubleGenerator {
        double generate();
    }

    private static double summarize(DoubleGenerator g) {
        return g.generate() + g.generate(); // 2mal? x-Mal? Gar nicht?
    }

    // Standard-Interface von Java

    private static double summarize(Supplier<Double> g) {
        return g.get() + g.get(); // 2mal? x-Mal? Gar nicht?
    }

    public static void main(String[] args) {

        System.out.println(summarize(1.5, 2.6));
        System.out.println(summarize(Math.random(), Math.random()));

        System.out.println(summarize(new DoubleGenerator() { // anonyme Klasse
            @Override
            public double generate() {
                return Math.random();
            }
        }));

        // Lambdas
        System.out.println(summarize(() -> {
                return Math.random();
            }
        ));
        System.out.println(summarize(() -> Math.random()));
        System.out.println(summarize(Math::random));



        // statt DoubleGenerator: Standard-FunctionalInterfaces: Supplier, Consumer, Function, Predicate

        Supplier<String> sup = new Supplier<String>() {
            @Override
            public String get() {
                return "text";
            }
        };

        Supplier<String> s = () -> "text";
        Supplier<Date> d = () -> new Date();
        Supplier<Date> d2 = Date::new;
        // d2.get()

        List<String> namen = Arrays.asList("Maximilian", "Stefanie", "Tom", "Beate").stream() //
            .filter(name -> name.length()>5) //
            .map(String::toUpperCase) //
            //.forEach(System.out::println);
            .collect(Collectors.toList());
        System.out.println(namen);

        //Stream.of("Maximilian", "Stefanie", "Tom", "Beate"). ...


    }

}
