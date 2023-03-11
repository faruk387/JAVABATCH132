package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;

public class BookDateTime09 {
    public static void main(String[] args) {
        LocalDate myDob = LocalDate.of(1996, 8, 21);
        LocalDate myKidsDob = LocalDate.of(2015, 3, 12);
       int sumOfMonth= myDob.getMonthValue()+myKidsDob.getMonthValue();
        System.out.println(sumOfMonth);

    }
}
