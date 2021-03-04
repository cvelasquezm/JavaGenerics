package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

        public void unmodifiableList() {

                List<String> unmodifiableList = List.copyOf(new ArrayList<>());

                //List<String> unmodifiableList = List.of("a");

                try {
                        unmodifiableList.add("b");
                } catch (Exception e) {
                        System.out.println("disallow add new elements");
                }

                try {
                        unmodifiableList.set(0, "");
                } catch (Exception e) {
                        System.out.println("disallow replacement elements");
                }

                try {
                        unmodifiableList.remove(0);
                } catch (Exception e) {
                        System.out.println("disallow remove elements");
                }

                try {
                        unmodifiableList.add(null);
                } catch (Exception e) {
                        System.out.println("disallow add \"null\" elements");
                }
        }

        public void testArrayList() {

                ArrayList<String> arrayList1 = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList1.ensureCapacity(10000);

                final long startTimeWithEnsuredCapacity = System.nanoTime();
                for (int i = 0; i < 100000; i ++) {
                        arrayList1.add("");
                }
                final long endTimeWithEnsuredCapacity = System.nanoTime();

                final long startTimeWithoutEnsuredCapacity = System.nanoTime();
                for (int i = 0; i < 100000; i ++) {
                        arrayList2.add("");
                }
                final long endTimeWithoutEnsuredCapacity = System.nanoTime();

                System.out.println("The spend time for ArrayList [with] ensure capacity is: " + (endTimeWithEnsuredCapacity - startTimeWithEnsuredCapacity)/1000);
                System.out.println("The spend time for ArrayList [without] ensure capacity is: " + (endTimeWithoutEnsuredCapacity - startTimeWithoutEnsuredCapacity)/1000);
        }

        public void testLinkedListVsArrayList() {

                LinkedList<Integer> linked = new LinkedList();
                ArrayList<Integer> array = new ArrayList<>();
                Vector<Integer> vector = new Vector<>();

                for (int i = 0; i < 100000; i ++) {
                        linked.add(i);
                        array.add(i);
                        vector.add(i);
                }

                final long startTimeArray = System.nanoTime();
                array.remove(50000);
                final long endTimeArray = System.nanoTime();

                final long startTimeLinked = System.nanoTime();
                linked.remove(50000);
                final long endTimeLinked = System.nanoTime();

                final long startTimeVector = System.nanoTime();
                vector.remove(50000);
                final long endTimeVector = System.nanoTime();

                System.out.println("Spend time removing one element");
                System.out.println("The spend time for ArrayList is: " + (endTimeArray - startTimeArray)/1000);
                System.out.println("The spend time for LinkedList is: " + (endTimeLinked - startTimeLinked)/1000);
                System.out.println("The spend time for Vector is: " + (endTimeVector - startTimeVector)/1000);
        }
}
