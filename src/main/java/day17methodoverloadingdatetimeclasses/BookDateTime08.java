package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;

public class BookDateTime08 {
    public static void main(String[] args) {
        LocalDate myDob = LocalDate.of(1996, 8, 21);
        System.out.println(myDob.isLeapYear());
    }
}
