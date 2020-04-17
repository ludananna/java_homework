package algorithm;

import java.util.Arrays;

public class Words {
    public static void main(String[] args) {
        String words = "For given text find the longest and the shortest words";

        String[] split = words.split("\\s+");
        String max = split[0];
        String min = split[0];
        String minWords = "";
        String maxWords = "";
        System.out.println("split = " + Arrays.toString(split));
        for (String s : split) {
            if (max.length() < s.length()) {
                max = s;
                maxWords += max + ", ";
            }
            if (min.length() >= s.length()) {
                min = s;
                minWords += min + ", ";

            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("minWords = " + minWords);
        System.out.println("maxWords = " + maxWords);

    }

}
