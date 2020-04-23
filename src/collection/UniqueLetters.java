package collection;

import java.util.*;

public class UniqueLetters {
    public static void main(String[] args) {
        Set<Character> set = new LinkedHashSet<>();


        String sentence = "This is a test text";
        System.out.println("sentence = " + sentence);
        String[] words = sentence.split("\\s+");
        System.out.println("words = " + Arrays.toString(words));
        for (String word : words) {
            char[] chars = word.toCharArray();
            System.out.println("word = " + word + ", chars = " + Arrays.toString(chars));
            for (char aChar : chars) {
                System.out.println("aChar = " + aChar);
                set.add(aChar);
                System.out.println("set = " + set);
            }
        }

    }
}
