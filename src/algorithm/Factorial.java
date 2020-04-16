package algorithm;

public class Factorial {


    private static int factorial(int n) {

        if (n == 0) {
            return 1;
        }if (n < 0) {

            return Integer.parseInt(null);
        }
        int i = n * factorial(n - 1);
        System.out.print(" " + i);
        return i;
    }

    public static void main(String[] args) {
       factorial(10);
    }
}
