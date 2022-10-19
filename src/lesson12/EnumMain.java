package lesson12;

import java.util.Arrays;

public class EnumMain {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;

        System.out.println(dayOfWeek.getShortName());
        System.out.println(dayOfWeek.name());
        System.out.println(dayOfWeek.ordinal());
        System.out.println(dayOfWeek.toString());
        System.out.println(Arrays.toString(DayOfWeek.values()));
        DayOfWeek dayOfWeek1 = DayOfWeek.valueOf("FRIDAY");
        System.out.println(dayOfWeek1);


        System.out.println(dayOfWeek.isWorkday());
        System.out.println(dayOfWeek1.isWorkday());

        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("workday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("weekend");
                break;
            default:
                System.out.println("error");
        }


        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(sunday.isWorkday());
    }
}
