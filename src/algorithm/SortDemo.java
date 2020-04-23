package algorithm;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int[] n = {7, 5, 4, 7, 9, 1};
        System.out.println("before sort:");
        for (int i = 0; i < n.length; i++)
            System.out.print(Arrays.toString(n));
        System.out.println();
        SelectionSort.sort(n);
        System.out.println("after sort:");
        for (int i = 0; i < n.length; i++)
            System.out.print(Arrays.toString(n));

    }


}



