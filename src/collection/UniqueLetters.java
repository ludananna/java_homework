package collection;

import java.util.*;

public class UniqueLetters {
    public static void main(String[] args) {
        String sentence = "This is a test text";
        String[] words = sentence.split("\\s+");
        Set<Character> set = new LinkedHashSet<>();
        for (String word : words) {
            for (char aChar : word.toCharArray()) {
                set.add(aChar);
            }
        }

        System.out.println("set = " + set);
    }
}
