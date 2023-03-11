package day17methodoverloadingdatetimeclasses;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class BookDateTime12 {
    public static void main(String[] args) {
        LocalDateTime timeInJapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime timeInGerman=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInGerman);
        System.out.println(timeInJapan);
        long difference = ChronoUnit.HOURS.between(timeInGerman, timeInJapan);
        System.out.println(difference);


    }
}
