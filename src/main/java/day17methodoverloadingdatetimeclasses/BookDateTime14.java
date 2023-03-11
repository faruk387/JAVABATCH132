package day17methodoverloadingdatetimeclasses;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class BookDateTime14 {
    public static void main(String[] args) {
        LocalDateTime alis= LocalDateTime.of(2015,2,5,10,15,0);
        LocalDateTime aliLeaves=alis.plusHours(23).plusMinutes(35);
        LocalDateTime marks= LocalDateTime.of(2015,3,6,12,25,0);
        LocalDateTime marksLeaves=marks.plusHours(1).plusMinutes(12);
        long difference= ChronoUnit.MINUTES.between(aliLeaves,marksLeaves);
        System.out.println(difference);

    }
}
