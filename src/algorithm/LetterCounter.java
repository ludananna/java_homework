package algorithm;

import java.util.*;

public class LetterCounter {
    public static void main(String[] args) {

        String sentence = "This is a test text";
        System.out.println("sentence = " + sentence);

        char[] chars = sentence.toCharArray();

        Map<Character, Integer> sentenceMap = new HashMap<>();
        for (char aChar : chars) {
            if (sentenceMap.containsKey(aChar)) {
                Integer integer = sentenceMap.get(aChar);
                sentenceMap.put(aChar, integer + 1);
            } else {
                sentenceMap.put(aChar, 1);
            }
        }
        System.out.println("sentenceMap = " + sentenceMap);
    }
}
