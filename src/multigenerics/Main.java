package multigenerics;

public class Main {

    public static void main(String[] args){
        CustomMap<Integer, String> customMap = new CustomMap<>();
        customMap.add(0, "Cesar");
        customMap.add(1, "Andres");
        customMap.add(2, "Velasquez");
        customMap.add(3, "Martinez");

        System.out.println(customMap.get(0));
        System.out.println(customMap.get(1));
        System.out.println(customMap.get(2));
        System.out.println(customMap.get(3));
    }
}
