package more;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please, provide item price:");
        int price = scan.nextInt();
        System.out.println(" Please, input customer age:");
        int age = scan.nextInt();
        if (age < 6) {
            System.out.format("Discounted price is " + (price * 0.2));
        } else if (age < 18 && age > 6) {
            System.out.format("Discounted price is " + (price * 0.75));
        } else if (age > 65) {
            System.out.format("Discounted price is " + (price * 0.7));
        }
    }
}