package enums;

public class DaysOfWeek {
    public static void main(String[] args) {
        EnumDays pon = EnumDays.MON;
        System.out.println("eng = " + pon.fromEnglishName());
        System.out.println("pl = " + pon.fromPolishName());
        System.out.println("isWeekend = " + pon.isWeekend());

        System.out.println(pon.getWeekends());
        System.out.println(pon.getWorkingDays());


        EnumDays vtornik = EnumDays.TUE;
        System.out.println(vtornik.fromEnglishName());
        System.out.println(vtornik.fromPolishName());
        System.out.println(vtornik.isWeekend());
        System.out.println(vtornik.getWeekends());


    }
}
