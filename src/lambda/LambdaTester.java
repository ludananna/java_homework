package lambda;

import java.util.function.Function;

public class LambdaTester {
    public static void main(String[] args) {
        String bookName = "The Hobbit";

        String upper = modifyString(bookName, s -> s.toUpperCase());
        System.out.println("upper = " + upper);

        String bookName2 = "Hobbit Bilbo";

        String lower = modifyString(bookName2, s -> s.toLowerCase());
        System.out.println("lower = " + lower);

        String bookName3 = "Bilbo Beggins";

        modifyString(bookName3, a -> String.valueOf(a.toCharArray()[0]));


        String first = modifyString(bookName3, a -> String.valueOf(a.toCharArray()[0]));
        System.out.println("first = " + first);


        String bookName4 = "Lord of the rings";

        String last = modifyString(bookName4, a -> String.valueOf(a.toCharArray()[a.length() - 1]));
        System.out.println("last = " + last);


        int strLength = returnInt(bookName4,s -> s.length());

        System.out.println("strLength =" + strLength);


        int strWords = returnInt(bookName4, s -> s.split(" ").length );
        System.out.println("strWords = " + strWords);


    }

    public static String modifyString(String str, Function<String, String> func) {
        return func.apply(str);
    }

    public static Integer returnInt(String st, Function<String, Integer> funct) {
        return funct.apply(st);

    }

}
