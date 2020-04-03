package algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        int swap;

        System.out.println("Array Before Bubble Sort");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        System.out.println("Array After Bubble Sort");
        System.out.print(Arrays.toString(arr));

    }
}

