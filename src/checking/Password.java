package checking;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter your password:");
        String pass = scan.next();
        System.out.print("Please, repeat password:");
        String pass1 = scan.next();

        int passwordLength = pass.length();

        if (passwordLength < 8){
            System.out.print("Passwords should be at least 8 characters long!");
        }else if (pass.equals(pass1)) {
            System.out.println("Passwords is OK");
        } else {
            System.out.println("Passwords should be the same!");
        }
    }
}
