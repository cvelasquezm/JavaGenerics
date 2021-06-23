package collections.list;

import java.util.List;
import java.util.concurrent.Callable;

public class Task implements Callable<Boolean> {

    List list = null;

    public Task(List list) {
        this.list = list;
    }

    @Override
    public Boolean call() {
        for (int i = 0; i < 10000; i ++) {
            this.list.add("");
            System.out.println(this.list.hashCode());
        }
        return true;
    }
}
