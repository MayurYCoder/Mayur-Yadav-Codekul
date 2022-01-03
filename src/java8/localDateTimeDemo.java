package java8;

import java.time.*;
import java.util.Date;

public class localDateTimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date obj = new Date(1639738026426l);
        System.out.println(obj);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.minusDays(2));
        System.out.println(localDate.getDayOfMonth());

        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        System.out.println(zoneId);

        LocalDate localDate1 = LocalDate.now(zoneId);
        System.out.println(localDate1);
        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate from = LocalDate.of(2021, 12, 17);
        LocalDate to = LocalDate.of(2022, 1, 1);
        Period period = Period.between(from, to);
        System.out.println(period);

        LocalTime fromTime = LocalTime.of(22, 15, 31);
        LocalTime toTime = LocalTime.of(22, 15, 31);
        Duration duration = Duration.between(fromTime, toTime);
        System.out.println(duration);


    }
}
