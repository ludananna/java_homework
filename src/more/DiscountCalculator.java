package more;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, provide item price:");
        int price = scan.nextInt();
        System.out.print("Please, input customer age:");
        int age = scan.nextInt();
        double discount = 1;
        if (age < 6) {
            discount = 0.2;
        } else if (age <= 18) {
            discount = 0.75;
        } else if (age > 65) {
            discount = 0.7;
        }
        System.out.format("Discounted price is " + (price * discount));
    }
}