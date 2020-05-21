package enums;

import java.util.ArrayList;
import java.util.List;

public enum EnumDays {
    MON("Monday", "Poniedziałek ", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Środa", true),
    THU("Thursday", "Czwartek", true),
    FRI("Friday", "Piątek ", true),
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

    public String fromEnglishName() {
        return englishName;
    }

    public String fromPolishName() {
        return polishName;
    }

    public boolean isWeekend() {
        return !workingDay;
    }

    public List<EnumDays> getWeekends() {
        List<EnumDays> enumDays = new ArrayList<>();
        for (EnumDays value : values()) {
            if (!value.workingDay) {
                enumDays.add(value);
            }
        }
        return enumDays;
    }


    public List<EnumDays> getWorkingDays() {
        List<EnumDays> enumDays = new ArrayList<>();
        for (EnumDays value : values()) {
            if (value.workingDay) {
                enumDays.add(value);
            }
        }
        return enumDays;
    }
}


