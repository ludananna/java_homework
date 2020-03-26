package more;

public class PrimeNumbers {

    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            boolean isPrime = true;
            int y = 2;
            while (y <= x / 2) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
                y++;
            }
            if (isPrime)
                System.out.print(x + " ");
        }
    }
}

