package day17methodoverloadingdatetimeclasses;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class BookDateTime15 {
    public static void main(String[] args) {
        LocalDateTime timeInTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime timeInGmt = LocalDateTime.now(ZoneId.of("GMT"));
        long diffInHours = ChronoUnit.HOURS.between(timeInGmt, timeInTokyo);
        System.out.println(diffInHours);
        LocalDateTime dobMark = LocalDateTime.of(2018, 2, 23, 15, 25, 0).minusHours(diffInHours);
        System.out.println("Date of birth in Tokyo is " + dobMark);

    }
}
