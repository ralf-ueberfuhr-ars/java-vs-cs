package de.ars.javavscs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample {

    private static class Person implements Comparable<Person> {

        private String name;

        public Person(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        Set<String> namen = new TreeSet<>(); // sortierte Menge
        namen.add("Stefanie");
        namen.add("Jörg");
        namen.add("Jörg");
        namen.add("Max");
        System.out.println(namen);

        Set<Person> personen = new TreeSet<>(); // sortierte Menge
        personen.add(new Person("Stefanie"));
        personen.add(new Person("Jörg"));
        personen.add(new Person("Jörg"));
        personen.add(new Person("Max"));
        System.out.println(personen);

    }

}
