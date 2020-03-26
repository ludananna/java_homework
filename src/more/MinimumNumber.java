package more;

public class MinimumNumber {
    public static void main(String[] args) {

        int minValue = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) < minValue) {
                minValue = Integer.parseInt(args[i]);
            }
        }
        System.out.println(minValue);
    }
}

