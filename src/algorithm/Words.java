package algorithm;

import java.util.Arrays;

public class Words {
    public static void main(String[] args) {
        String words = "For given text find the longest and the shortest words";

        String[] sentence = words.split("\\s+");
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        String minWords = "";
        String maxWords = "";
        System.out.println("sentence = " + Arrays.toString(sentence));
        for (String word : sentence) {
            int wordLength = word.length();
            if (maxValue < wordLength) {
                maxValue = wordLength;
                maxWords = "";
            }
            if (maxValue == wordLength) {
                maxWords = maxWords + word + ", ";
            }
            if (minValue > wordLength) {
                minValue = wordLength;
                minWords = "";
            }
            if (minValue == wordLength) {
                minWords = minWords + word + ", ";
            }
        }
        System.out.println("minWords = " + minWords);
        System.out.println("maxWords = " + maxWords);
    }

}
