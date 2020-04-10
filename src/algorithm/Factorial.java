package algorithm;

public class Factorial {
    public static void main(String[] args) {
        System.out.print(factorial(1) + " ");
        System.out.print(factorial(2)+ " ");
        System.out.print(factorial(3)+ " ");
        System.out.print(factorial(4)+ " ");
        System.out.print(factorial(5)+ " ");
        System.out.print(factorial(6)+ " ");
        System.out.print(factorial(7)+ " ");
        System.out.print(factorial(8)+ " ");
        System.out.print(factorial(9)+ " ");
        System.out.print(factorial(10)+ " ");

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {

            return n * factorial(n - 1);
        }
    }
}