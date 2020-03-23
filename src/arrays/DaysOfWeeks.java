package arrays;

public class DaysOfWeeks {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[5]);
        System.out.println(days[6]);


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }

}
