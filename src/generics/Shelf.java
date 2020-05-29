package generics;

import java.util.ArrayList;
import java.util.List;


public class Shelf<T> {

    List<T> boxes = new ArrayList<>();

    public void addBox(T boxes) {
        this.boxes.add(boxes);
    }

    List<T> getBoxes() {
        return boxes;
    }
}
