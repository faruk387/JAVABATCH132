package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BookDateTime01and02 {
    // Type the code that finds out how many days Ali lived.
    //Date of birth of Ali is 12th of May 2002
    public static void main(String[] args) {
        LocalDate FaruksBirthday=LocalDate.of(1987,01,29);
        LocalDate dateNow=LocalDate.now();
        long numberOfDaysFarukLived= ChronoUnit.DAYS.between(FaruksBirthday,dateNow);
        System.out.println("Days: "+numberOfDaysFarukLived);
        long numberOfWeeksFarukLived=ChronoUnit.WEEKS.between(FaruksBirthday,dateNow);
        System.out.println("Weeks: "+numberOfWeeksFarukLived);
        long numberOfMonthsFarukLived=ChronoUnit.MONTHS.between(FaruksBirthday,dateNow);
        System.out.println("Months: "+numberOfMonthsFarukLived);
        long numberOfYearFarukLived=ChronoUnit.YEARS.between(FaruksBirthday,dateNow);
        System.out.println("Year: "+numberOfYearFarukLived);
    }
}
