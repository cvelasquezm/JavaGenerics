package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void testHashMapWithStrings() {
        System.out.println("HashMapWithStrings");

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("null", null);

        hashMap.put("one", "one");
        hashMap.put("two", "two");
        hashMap.put("tree", "tree");
        hashMap.put("four", "four");

        //There isn't warranty of order
        hashMap.forEach((k, v) -> {
            System.out.println(v);
        });
        System.out.println("_______________________________________");
    }

    public static void testHashMapWithNumber() {
        System.out.println("HashMapWithNumber");

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(0, null);

        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 3);
        hashMap.put(4, 4);

        //There isn't warranty of order
        hashMap.forEach((k, v) -> {
            System.out.println(v);
        });
        System.out.println("_______________________________________");
    }

    public static void testLinkedHashMapWithStrings() {
        System.out.println("LinkedHashMapWithStrings");

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("null", null);

        linkedHashMap.put("one", "one");
        linkedHashMap.put("two", "two");
        linkedHashMap.put("four", "four");
        linkedHashMap.put("tree", "tree");

        //Is ordered
        linkedHashMap.forEach((k, v) -> {
            System.out.println(v);
        });
        System.out.println("_______________________________________");
    }

    public static void testLinkedHashMapWithNumber() {
        System.out.println("LinkedHashMapWithNumber");

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(0, null);

        linkedHashMap.put(1, 1);
        linkedHashMap.put(3, 3);
        linkedHashMap.put(2, 2);
        linkedHashMap.put(4, 4);

        //Is Ordered
        linkedHashMap.forEach((k, v) -> {
            System.out.println(v);
        });
        System.out.println("_______________________________________");
    }

    public static void testTreeMapWithStrings() {
        System.out.println("TreeMapWithStrings");

        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("null", null);

        treeMap.put("one", "one");
        treeMap.put("two", "two");
        treeMap.put("tree", "tree");
        treeMap.put("four", "four");

        //Is ordered
        treeMap.forEach((k, v) -> {
            System.out.println(v);
        });
        System.out.println("_______________________________________");
    }

    public static void testTreeMapWithNumber() {
        System.out.println("TreeMapWithNumber");

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(0, null);

        treeMap.put(1, 1);
        treeMap.put(2, 2);
        treeMap.put(3, 3);
        treeMap.put(4, 4);

        //Is Ordered
        treeMap.forEach((k, v) -> {
            System.out.println(v);
        });
        System.out.println("_______________________________________");
    }
}
