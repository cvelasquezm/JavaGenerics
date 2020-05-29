package multigenerics;

import java.util.ArrayList;
import java.util.List;

public class CustomMap<K, V> {
    List<K> keys;
    List<V> values;

    public CustomMap(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void add(K key, V value){
        keys.add(key);
        values.add(value);
    }

    public V get(K key){
        return values.get(keys.indexOf(key));
    }
}
