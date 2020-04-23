package collection;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

import static java.lang.System.currentTimeMillis;


public class ListList {

    public static final int ITERATIONS = 100_000;

    public static void main(String[] args) {

        long starTime = currentTimeMillis();
        List<Integer> arrayNumbers = new ArrayList<>();
        for (int i = 0; i < ITERATIONS; i++) {
            arrayNumbers.add(0, i);
        }
        long endTime = currentTimeMillis();
        System.out.println("Adding to the beginning of the ArrayList = " + (endTime - starTime));


        long starTime2 = currentTimeMillis();
        List<Integer> linkedNumbers = new LinkedList<>();
        for (int i = 0; i < ITERATIONS; i++) {
            linkedNumbers.add(0, i);
        }
        long endTime2 = currentTimeMillis();
        System.out.println("Adding to the beginning of the LinkedList = " + (endTime2 - starTime2));

        long starTime3 = currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            arrayNumbers.get(i);
        }
        long endTime3 = currentTimeMillis();
        System.out.println("Getting elements from the ArrayList = " + (endTime3 - starTime3));

        long starTime4 = currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            linkedNumbers.get(i);
        }
        long endTime4 = currentTimeMillis();
        System.out.println("Getting elements from the LinkedList = " + (endTime4 - starTime4));


    }
}

