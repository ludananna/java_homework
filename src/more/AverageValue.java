package more;

public class AverageValue {
    public static void main(String[] args) {
        double sum = 0;

        for (String number : args) {
            double parsedNumber = Double.parseDouble(number);
            sum += parsedNumber;
        }

        double average = sum / args.length;
        System.out.println(average);
    }
}
