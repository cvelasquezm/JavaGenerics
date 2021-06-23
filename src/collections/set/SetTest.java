package collections.set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {


        public void testLinkedHashSetWithIntNumbers() {

                LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

                for (int i = 0; i < 10; i++) {
                        linkedHashSet.add(i);
                }

                //Allows Null
                linkedHashSet.add(null);

                //There isn't warranty of order
                System.out.println("Printing\n");
                for (Integer element : linkedHashSet) {
                        System.out.println("Element --> " + element);
                }
                System.out.println("\nEnd Printing\n");
        }

        public void testLinkedHashSetWithStrings() {

                LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

                String names = "Mia,Tim,Bea,Zoe,Sue,Len,Moe,Lou,Rae";
                final String[] strings = names.split(",");

                System.out.println("Inserting\n");
                for (int i = 0; i < strings.length; i++) {
                        System.out.println(strings[i]);
                        linkedHashSet.add(strings[i]);
                }
                System.out.println("\nEnd Inserting\n");

                //Allows Null
                linkedHashSet.add(null);

                //There isn't warranty of order
                System.out.println("Printing\n");
                for (String element : linkedHashSet) {
                        System.out.println("Element --> " + element);
                }
                System.out.println("\nEnd Printing");

        }

        public void testLinkedHashSetWithComplexObjects() {
                System.out.println("The treeSet is ordered based on natural ordering or by Comparator provided\n");
                LinkedHashSet<CarNotComparable> linkedHashSet = new LinkedHashSet<>();

                final CarNotComparable[] cars = { new CarNotComparable("ABG654", "Toyota"),
                    new CarNotComparable("ZGF764", "Audi"),
                    new CarNotComparable("B767DS", "Chevrolet"),
                    new CarNotComparable("1CUY65", "Mazda")
                };
                System.out.println("Inserting\n");
                for (int i = 0; i < cars.length; i++) {
                        System.out.println(cars[i].getLicencePlate());
                        linkedHashSet.add(cars[i]);
                }
                System.out.println("\nEnd Inserting\n");

                System.out.println("-----------------");

                System.out.println("\nPrinting\n");
                for (CarNotComparable element : linkedHashSet) {
                        System.out.println("Element --> " + element.getLicencePlate() + " : " + element.getLicencePlate().hashCode());
                }
                System.out.println("\nEnd Printing");
        }

        public void testHashSetWithIntNumbers() {

                HashSet<Integer> hashSet = new HashSet<>();

                for (int i = 0; i < 10; i++) {
                        hashSet.add(i);
                }

                //Allows Null
                hashSet.add(null);

                //There isn't warranty of order
                System.out.println("Printing\n");
                for (Integer element : hashSet) {
                        System.out.println("Element --> " + element);
                }
                System.out.println("\nEnd Printing\n");
        }

        public void testHashSetWithStrings() {

                HashSet<String> hashSet = new HashSet<>();

                String names = "Mia,Tim,Bea,Zoe,Sue,Len,Moe,Lou,Rae";
                final String[] strings = names.split(",");

                System.out.println("Inserting\n");
                for (int i = 0; i < strings.length; i++) {
                        System.out.println(strings[i]);
                        hashSet.add(strings[i]);
                }
                System.out.println("\nEnd Inserting\n");

                //Allows Null
                hashSet.add(null);

                //There isn't warranty of order
                System.out.println("Printing\n");
                for (String element : hashSet) {
                        System.out.println("Element --> " + element);
                }
                System.out.println("\nEnd Printing");

        }

        public void testHashSetWithComplexObjects() {
                System.out.println("The treeSet is ordered based on natural ordering or by Comparator provided\n");
                HashSet<Car> treeSet = new HashSet<>();

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
                        System.out.println("Element --> " + element.getLicencePlate() + " : " + element.getLicencePlate().hashCode());
                }
                System.out.println("\nEnd Printing");

                final boolean contains = treeSet.contains(new Car("ABG654", "Toyota"));
                System.out.println("Contains car --> " + contains);

        }

        public void testTreeSetWithStrings() {
                System.out.println("The treeSet is ordered based on natural ordering or by Comparator provided\n");
                TreeSet<String> treeSet = new TreeSet<>();

                String names = "Mia,Tim,Bea,Zoe,Sue,Len,Moe,Lou,Rae";
                final String[] strings = names.split(",");

                try {
                        treeSet.add(null);
                } catch (NullPointerException e) {
                        System.out.println("Disallowed null values");
                }

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

        public void testTreeSetWithIntegers() {
                System.out.println("The treeSet is ordered based on natural ordering or by Comparator provided\n");
                TreeSet<Integer> treeSet = new TreeSet<>();

                final Integer[] numbers = {1,2,3,12,4,5,11,6,7,8,9,10};
                System.out.println("Inserting\n");
                for (int i = 0; i < numbers.length; i++) {
                        System.out.println(numbers[i]);
                        treeSet.add(numbers[i]);
                }
                System.out.println("\nEnd Inserting\n");
                System.out.println("-----------------");

                System.out.println("\nPrinting\n");
                for (Integer element : treeSet) {
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
                        System.out.println("Element --> " + element.getLicencePlate() + " : " + element.getLicencePlate().hashCode());
                }
                System.out.println("\nEnd Printing");

                final boolean contains = treeSet.contains(new Car("ABG654", "Toyota"));
                System.out.println("Contains car --> " + contains);

        }

        public void testEnumSet() {
                EnumSet<CarTypes> enumSet = EnumSet.of(CarTypes.COUPE, CarTypes.LIMOUSINE, CarTypes.SEDAN);

                for (CarTypes types : enumSet){
                        System.out.println(types);
                }
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

                @Override
                public int compareTo(Car o) {
                        return (this.licencePlate.hashCode() - o.getLicencePlate().hashCode()) *
                            (this.brand.hashCode() - o.getBrand().hashCode());
                }

                @Override
                public int hashCode(){
                        int h = 1;
                        h *= 1000003;
                        h ^= this.licencePlate.hashCode();
                        h *= 1000003;
                        h ^= this.brand.hashCode();

                        return h;
                }
        }

        class CarNotComparable {

                private String licencePlate;
                private String brand;

                public CarNotComparable(String licencePlate, String brand) {
                        this.licencePlate = licencePlate;
                        this.brand = brand;
                }

                public String getLicencePlate() {
                        return licencePlate;
                }

                public String getBrand() {
                        return brand;
                }

                @Override
                public boolean equals(Object object){
                        if (object == null){
                                return false;
                        }
                        final CarNotComparable o = (CarNotComparable) object;

                        return this.brand.equals(o.brand) && this.licencePlate.equals(o.licencePlate) ? true : false;
                }
        }

        enum CarTypes {
                SEDAN, LIMOUSINE, COUPE
        }
}
