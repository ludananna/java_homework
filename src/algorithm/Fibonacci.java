package algorithm;

public class Fibonacci {

    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i <= 7; i++) {

            n2 = n0 + n1;

            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}

