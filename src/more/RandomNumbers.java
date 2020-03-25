package more;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 101);
        }
        System.out.println(Arrays.toString(array));

    }

}
