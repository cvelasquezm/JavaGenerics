package collections.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ListTest {


        /**
         * This test shows the behaviour of unmodifiable List
         */
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

        //It doesn't work as expected
        public void testArrayListWithEnsureCapacity() {

                ArrayList<String> arrayList1 = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList1.ensureCapacity(100000);



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

        public void testArrayListFeatures() {
                testListFeatures(new ArrayList());
                /*try {
                        ExecutorService executorService = Executors.newFixedThreadPool(2);

                        executorService.submit(() -> {
                                for (int i = 0; i < 100000; i ++) {
                                        if (i % 2 == 0){
                                                list.add("");
                                        } else {
                                                list.remove("");
                                        }

                                        System.out.println(Thread.currentThread().getName());
                                }
                                return true;
                        });

                        executorService.submit(() -> {
                                for (int i = 0; i < 100000; i ++) {
                                        if (i % 2 == 0){
                                                list.add("");
                                        } else {
                                                list.remove("");
                                        }
                                        System.out.println(Thread.currentThread().getName());
                                }
                                return true;
                        });
                } catch (ConcurrentModificationException e) {
                        System.out.println("Fail-fast: ConcurrentModificationException");
                }
                */
        }

        public void testLinkedListFeatures() {
                testListFeatures(new LinkedList());
        }

        public void testVectorFeatures() {
                testListFeatures(new Vector());
        }

        public void testListFeatures(List list) {
                //It Allows null values
                list.add(null);

                //It's ordered
                for (int i = 0; i < 10;i ++){
                        list.add(i);
                }

                list.forEach(l -> {
                        System.out.println(l);
                });
                System.out.println("--------------------------");
        }

        public void testLinkedListVsArrayList() {
                int MAX_ELEMENTS_TO_ADD = 100000;
                int INDEX_TO_REMOVE = 50000;
                LinkedList<Integer> linked = new LinkedList();
                ArrayList<Integer> array = new ArrayList<>();
                Vector<Integer> vector = new Vector<>();

                /**
                 * Adding elements
                 */
                final long startTimeLinkedListAdding = System.nanoTime();
                for (int i = 0; i < MAX_ELEMENTS_TO_ADD; i ++) {
                        linked.add(i);
                }
                final long endTimeLinkedListAdding = System.nanoTime();

                final long startTimeArrayAdding = System.nanoTime();
                for (int i = 0; i < MAX_ELEMENTS_TO_ADD; i ++) {
                        array.add(i);
                }
                final long endTimeArrayAdding = System.nanoTime();

                final long startTimeVectorAdding = System.nanoTime();
                for (int i = 0; i < MAX_ELEMENTS_TO_ADD; i ++) {
                        vector.add(i);
                }
                final long endTimeVectorAdding = System.nanoTime();

                /**
                 * Removing Elements
                 */
                final long startTimeArrayRemoving = System.nanoTime();
                array.remove(INDEX_TO_REMOVE);
                final long endTimeArrayRemoving = System.nanoTime();

                final long startTimeLinkedRemoving = System.nanoTime();
                linked.remove(INDEX_TO_REMOVE);
                final long endTimeLinkedRemoving = System.nanoTime();

                final long startTimeVectorRemoving = System.nanoTime();
                vector.remove(INDEX_TO_REMOVE);
                final long endTimeVectorRemoving = System.nanoTime();

                System.out.println("Spend time removing one element");
                System.out.println("The spend time for ArrayList is: " + (endTimeArrayRemoving - startTimeArrayRemoving)/1000);
                System.out.println("The spend time for LinkedList is: " + (endTimeLinkedRemoving - startTimeLinkedRemoving)/1000);
                System.out.println("The spend time for Vector is: " + (endTimeVectorRemoving - startTimeVectorRemoving)/1000);
                System.out.println();
                System.out.println("Spend time adding some elements");
                System.out.println("The spend time for ArrayList is: " + (endTimeArrayAdding - startTimeArrayAdding)/1000);
                System.out.println("The spend time for LinkedList is: " + (endTimeLinkedListAdding - startTimeLinkedListAdding)/1000);
                System.out.println("The spend time for Vector is: " + (endTimeVectorAdding - startTimeVectorAdding)/1000);
        }
}
