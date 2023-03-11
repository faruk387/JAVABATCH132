package day17methodoverloadingdatetimeclasses;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class BookDateTime13 {
    public static void main(String[] args) {
        ZonedDateTime alisBirthday=LocalDateTime.of(2015,2,5,10,0,0).atZone(ZoneId.of("Europe/Istanbul"));
        ZonedDateTime marksBirthday=LocalDateTime.of(2015,2,5,12,0,0).atZone(ZoneId.of("America/New_York"));
        long difference= ChronoUnit.HOURS.between(alisBirthday,marksBirthday);
        System.out.println(alisBirthday);
        System.out.println(marksBirthday);
        System.out.println(difference);


    }
}
