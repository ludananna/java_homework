package more;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sum = 0;
        for (String s : args) {
            double num = Double.parseDouble(s);
            sum = sum + num;

        }
        System.out.println(sum);
    }
}