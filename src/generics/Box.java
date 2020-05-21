package generics;

import java.util.ArrayList;
import java.util.List;


public class Box<T> {

    List<T> items = new ArrayList<>();
    T object;

    public void add(T item) {
       items.add(item);
    }

    List<T> getItems()  {
        return items;
    }


}
