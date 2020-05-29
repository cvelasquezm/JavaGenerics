package singlegenerics;

public class Main {

    public static void main(String[] args){
        Person person = new Person("FirstName", "LastName", 30);
        ObjectManager<Person> personManager = new ObjectManager<>();

        personManager.setValue(person);
        Person result = personManager.getValue();
        System.out.println(result.getName());
        System.out.println(result.getLastName());
        System.out.println(result.getAge());
    }

}
