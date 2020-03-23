package arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] num = {30, 20};
        System.out.println(Arrays.toString(num));
        int a = num[0];
        num[0] = num[1];
        num[1] = a;
        System.out.println(Arrays.toString(num));
    }
}