package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;

public class BookDateTime04 {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1993,9,15);
        LocalDate alisBirthday=date1.plusYears(45).minusMonths(8).plusDays(5);
        LocalDate velisBirthday=date2.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("Alis Birthday: "+alisBirthday);
        System.out.println("Velis Birthday: "+velisBirthday);
        boolean sameBirthday=alisBirthday.isEqual(velisBirthday);
        System.out.println("is it same birthday: "+sameBirthday);

    }
}
