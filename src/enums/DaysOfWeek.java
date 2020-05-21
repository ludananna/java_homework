package enums;

public class DaysOfWeek {
    public static void main(String[] args) {
        System.out.println("eng = " + EnumDays.fromEnglishName("Monday"));
        System.out.println("pl = " + EnumDays.fromPolishName("Środa"));
        System.out.println("eng = " + EnumDays.fromEnglishName("October"));

        System.out.println(EnumDays.getWeekends());
        System.out.println(EnumDays.getWorkingDays());


    }
}
