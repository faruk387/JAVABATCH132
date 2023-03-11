package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;

public class BookDateTime07 {
    public static void main(String[] args) {
        int dateNow=LocalDate.now().getYear();
        System.out.println(dateNow);
        System.out.println(dateNow%100);

    }
}
