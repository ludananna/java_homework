import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        do {
            System.out.println("Input your text please:");

        } while (!value.equalsIgnoreCase("exit"));
    }

}
