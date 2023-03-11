package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;

public class BookDateTime05 {
    public static void main(String[] args) {
        LocalDate alisBirthday=LocalDate.of(2012,11,24);
        LocalDate velisBirtday=alisBirthday.plusYears(3).plusDays(11);
        System.out.println("Velis Birthday is: "+velisBirtday);
    }
}
