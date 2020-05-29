package boundedgenerics;

public class NumberManager <T extends Number> {
    T value;

    public T get() {
        return value;
    }

    public void add(T value) {
        this.value = value;
    }


}
