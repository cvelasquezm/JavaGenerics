package collections.hashtable;

import java.util.Objects;

public class Person {

        private String name;
        private String lastName;

        public Person(String name, String lastName) {
                this.name = name;
                this.lastName = lastName;
        }

        public String getName() {
                return name;
        }

        public String getLastName() {
                return lastName;
        }

        @Override
        public boolean equals(Object o){
                if (this == o){
                        return true;
                }

                if (!(o instanceof Person)) {
                        return false;
                }

                return ((Person) o).getName() == this.getName()
                        && ((Person) o).getLastName() == this.getLastName();
        }

        @Override public int hashCode() {
                return Objects.hash(this.name.hashCode(), this.lastName.hashCode());
        }
}
