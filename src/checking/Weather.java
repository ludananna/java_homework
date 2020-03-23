package checking;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it raining now?");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Do not forget umbrella!");
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Leave umbrella at home");

        }

    }
}
