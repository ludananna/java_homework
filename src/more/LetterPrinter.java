package more;

public class LetterPrinter {

    public static void main(String[] args) {

        String value = args[0];
        char[] word = value.toCharArray();
        for (int i = 0; i < value.length(); i++)
            System.out.println(word[i]);

        System.out.println("===========");

        for (int i = 0; i < value.length(); i++) {
            char a = value.charAt(i);
            System.out.println(a);
        }
    }
}