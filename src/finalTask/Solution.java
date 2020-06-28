package finalTask;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Solution {

    public int secondMaxNumber(Collection<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number != max && number > max ){
                secondMax = max;
                max = number;
            } else if (number != max && number > secondMax ){
                secondMax = number;
            }
        }
        return secondMax;
    }

    public List<String> findPalindromes(Collection<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome(word)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
