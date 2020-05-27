package Example1;

public class Main {

    public static void main(String[] args){
        Person person = new Person("FirstName", "LastName", 30);
        SimpleGenericClass<Person> personManager = new SimpleGenericClass<>();

        personManager.setValue(person);
        Person result = personManager.getValue();
        System.out.println(result.getName());
        System.out.println(result.getLastName());
        System.out.println(result.getAge());
    }

}
