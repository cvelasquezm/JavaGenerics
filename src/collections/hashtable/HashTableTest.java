package collections.hashtable;

import java.util.Hashtable;

public class HashTableTest {

        public void testHashTableAndOverrideEqualsAndHashCodeMethod() {

                Hashtable<Person, String> table = new Hashtable();
                Person p = new Person("Cesar", "Velasquez");

                table.put(p, "a Person called Cesar");

                System.out.println(table.get(new Person("Cesar", "Velasquez")));
        }
}
