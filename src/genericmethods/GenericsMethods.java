package genericmethods;

import java.util.List;

public class GenericsMethods {
    public static <N extends Number> void sum(N a, N b){
        Integer sum = a.intValue() + b.intValue();
        System.out.println("Suma: "+sum);
    }

    public static <N> void checkList(List<?> list, N element){
        if (list.contains(element)){
            System.out.println("List contain the element: "+element);
        }else{
            System.out.println("List doesn't contain the element: "+element);
        }
    }
}
