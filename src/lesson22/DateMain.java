package lesson22;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date = new Date(l);
        System.out.println(date);
        Date date1 = new Date(1999657388552L); //  14 MAY 2033
//        date1.setDate();
        Date date2 = new Date(1999657388999L); //  14 MAY 2033
        Date date3 = new Date(1999657399999L); //  14 MAY 2033
        Calendar instance = Calendar.getInstance();
//        instance.set();
        System.out.println(date1);


        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);
        LocalDate of = LocalDate.of(2033, Month.MAY, 14);
        LocalDateTime of1 = LocalDateTime.of(2033, Month.MAY, 14, 0, 0, 0, 0);


        DayOfWeek dayOfWeek = of.getDayOfWeek();
        boolean leapYear = of.isLeapYear();
        boolean equal = of.isEqual(of1.toLocalDate());
        System.out.println(dayOfWeek);
        LocalDate localDate = of.plusDays(10);
        LocalDate localDate1 = of.minusDays(3);
        LocalDate plus = of.plus(50, ChronoUnit.MONTHS);
        LocalDate with = plus.with(TemporalAdjusters.lastDayOfMonth());

        Duration between = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusMinutes(50));
        Period between1 = Period.between(LocalDate.now(), LocalDate.now().plusDays(50));

        LocalDateTime plus1 = of1.plus(between);
        Duration duration = Duration.ofHours(3);
        System.out.println(duration);
        System.out.println(between1);

    }
}
