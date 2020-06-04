package generics;

import java.util.ArrayList;
import java.util.List;


public class Box<T extends Item> {

    List<T> items = new ArrayList<>();
    T object;

    public void add(T item) {
       items.add(item);
    }

    List<T> getItems()  {
        return items;
    }


}
