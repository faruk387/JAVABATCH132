package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;

public class BookDateTime03 {
    public static void main(String[] args) {
        LocalDate alisBirthday=LocalDate.of(1997,06,4);
        System.out.println(alisBirthday.plusYears(2).plusMonths(3).plusDays(12));
    }
}
