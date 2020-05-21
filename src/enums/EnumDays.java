package enums;

import java.util.ArrayList;
import java.util.List;

public enum EnumDays {
    MON("Monday", "Poniedziałek", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Środa", true),
    THU("Thursday", "Czwartek", true),
    FRI("Friday", "Piątek", true),
    SAT("Saturday", "Sobota", false),
    SUN("Sunday", "Niedziela", false);

    private String englishName;
    private String polishName;
    private boolean workingDay;

    EnumDays(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public static EnumDays fromEnglishName(String englishDayName) {
        for (EnumDays day : values()) {
            if (day.englishName.equals(englishDayName)) {
                return day;
            }
        }
        throw new RuntimeException("There is no such day like " + englishDayName);
    }

    public static EnumDays fromPolishName(String polishDayName) {
        for (EnumDays day : values()) {
            if (day.polishName.equals(polishDayName)) {
                return day;
            }
        }
        throw new RuntimeException("There is no such day like " + polishDayName);
    }


    public boolean isWeekend() {
        return !workingDay;
    }

    public static List<EnumDays> getWeekends() {
        List<EnumDays> enumDays = new ArrayList<>();
        for (EnumDays value : values()) {
            if (!value.workingDay) {
                enumDays.add(value);
            }
        }
        return enumDays;
    }


    public static List<EnumDays> getWorkingDays() {
        List<EnumDays> enumDays = new ArrayList<>();
        for (EnumDays value : values()) {
            if (value.workingDay) {
                enumDays.add(value);
            }
        }
        return enumDays;
    }
}


