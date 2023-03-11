package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BookDateTime10 {
    public static void main(String[] args) {
        LocalDate myDob = LocalDate.of(1996, 8, 21);
        LocalDate myKidsDob = LocalDate.of(2015, 3, 12);
        long differenceInHours = ChronoUnit.HOURS.between(myDob,myKidsDob);
        System.out.println("The difference in hours is " + differenceInHours);

    }
}
