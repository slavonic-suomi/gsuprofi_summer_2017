package by.gsu.lesson15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author vasiliy.pispanen.
 */
public class DateMain {
    public static void main(String[] args) throws ParseException {
        long start = System.currentTimeMillis();

        TimeZone moscow = TimeZone.getTimeZone("Europe/Moscow");
        Date date = new Date();

        System.out.println(date);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(moscow);
        //df.setLenient(false);
        Date parse = df.parse("2005-03-27 02:30:23");

        System.out.println(parse);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // java 5
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        instance.add(Calendar.YEAR, 1);

        instance.set(2015, 10, 13,10, 15, 30);
//        System.out.println(instance.get(Calendar.MILLISECOND));
        instance.set(Calendar.YEAR, 2007);
        int month = instance.get(Calendar.MONTH);
        System.out.println(month);

        //java 8
        java.time.Instant instant = Clock.systemDefaultZone().instant();
        ZoneId minsk = ZoneId.of("Europe/Moscow");

        LocalDate ld = LocalDate.of(2017, 10, 10);
        LocalTime lt = LocalTime.of(15, 30);

        LocalDateTime ldt = LocalDateTime.of(ld, lt);

        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.of(ldt, minsk);
        System.out.println(zdt);


        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime ldt2
                = LocalDateTime.parse("2005-03-27 02:30:23", formatter);
        ZonedDateTime minskZdt = ZonedDateTime.of(ldt2, minsk);
        System.out.println(minskZdt);

        ZonedDateTime minskZdt2 = minskZdt.plusYears(1);
        System.out.println(minskZdt2);
    }
}
