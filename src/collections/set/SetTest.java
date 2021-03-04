package collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

        public void testHashSetWithIntNumbers() {

                HashSet<Integer> hashSet = new HashSet<>();

                for (int i = 0; i < 100; i++) {
                        hashSet.add(i);
                }
                hashSet.add(null);

                for (Integer element : hashSet) {
                        System.out.println("Element --> " + element);
                }

        }

        public void testHashSetWithStrings() {

                HashSet<String> hashSet = new HashSet<>();

                String names = "Mia,Tim,Bea,Zoe,Sue,Len,Moe,Lou,Rae";
                final String[] strings = names.split(",");
                System.out.println("Inserting");
                for (int i = 0; i < strings.length; i++) {
                        System.out.println(strings[i]);
                        hashSet.add(strings[i]);
                }
                System.out.println("End Inserting");

                hashSet.add(null);

                System.out.println("Printing");
                for (String element : hashSet) {
                        System.out.println("Element --> " + element);
                }
                System.out.println("End Printing");

        }

        public void testTreeSetWithStrings() {
                System.out.println("The treeSet is ordered based on natural ordering or by Comparator provided\n");
                TreeSet<String> treeSet = new TreeSet<>();

                String names = "Mia,Tim,Bea,Zoe,Sue,Len,Moe,Lou,Rae";
                final String[] strings = names.split(",");
                System.out.println("Inserting\n");
                for (int i = 0; i < strings.length; i++) {
                        System.out.println(strings[i]);
                        treeSet.add(strings[i]);
                }
                System.out.println("\nEnd Inserting\n");
                System.out.println("-----------------");

                System.out.println("\nPrinting\n");
                for (String element : treeSet) {
                        System.out.println("Element --> " + element);
                }
                System.out.println("\nEnd Printing");

        }

        public void testTreeSetWithComplexObjects() {
                System.out.println("The treeSet is ordered based on natural ordering or by Comparator provided\n");
                TreeSet<Car> treeSet = new TreeSet<>();

                final Car[] cars = { new Car("ABG654", "Toyota"),
                                        new Car("ZGF764", "Audi"),
                                        new Car("B767DS", "Chevrolet"),
                                        new Car("1CUY65", "Mazda")
                };
                System.out.println("Inserting\n");
                for (int i = 0; i < cars.length; i++) {
                        System.out.println(cars[i].getLicencePlate());
                        treeSet.add(cars[i]);
                }
                System.out.println("\nEnd Inserting\n");
                System.out.println("-----------------");

                System.out.println("\nPrinting\n");
                for (Car element : treeSet) {
                        System.out.println("Element --> " + element.getLicencePlate());
                }
                System.out.println("\nEnd Printing");

                final boolean contains = treeSet.contains(new Car("ABG654", "Toyota"));
                System.out.println("Contains car --> " + contains);

        }

        class Car implements Comparable<Car> {

                private String licencePlate;
                private String brand;

                public Car(String licencePlate, String brand) {
                        this.licencePlate = licencePlate;
                        this.brand = brand;
                }

                public String getLicencePlate() {
                        return licencePlate;
                }

                public String getBrand() {
                        return brand;
                }

                @Override public int compareTo(Car o) {
                        return this.licencePlate.hashCode() - o.getLicencePlate().hashCode();
                }
        }


}
