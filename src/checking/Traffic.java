package checking;


import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        String name = 10 == 5 ? "ten" : "five";
        System.out.println("name = " + name);

        boolean a = true;




        System.out.println("What the light?");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if (word.equalsIgnoreCase("Green")) {
            System.out.println("go");
        } else if (word.equalsIgnoreCase("Yellow") || word.equalsIgnoreCase("Red")) {
            System.out.println("stop");
        } else if (word.equalsIgnoreCase("Red+Yellow")) {
            System.out.println("get ready to go");
        }



    }
}
