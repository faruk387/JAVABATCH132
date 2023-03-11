package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BookDateTime06 {
    public static void main(String[] args) {
        LocalDate tubasFödelseDag=LocalDate.of(2016,3,21);
        LocalDate maryamsFödelseDag=LocalDate.of(1996,12,31);
        LocalDate faruksFödelseDag=LocalDate.of(1987,1,27);
        long diffrencetubaMaryam= ChronoUnit.DAYS.between(maryamsFödelseDag,tubasFödelseDag);
        long differencetubaFaruk=ChronoUnit.DAYS.between(faruksFödelseDag,tubasFödelseDag);
        long differencemaryamFaruk=ChronoUnit.DAYS.between(faruksFödelseDag,maryamsFödelseDag);
        System.out.println("Faruk är "+differencemaryamFaruk+" dagar äldre än Maryam");
        System.out.println("Faruk är "+differencetubaFaruk+" dagar äldre än Tuba");
        System.out.println("Maryam är "+diffrencetubaMaryam+" dagar äldre än Tuba");

    }
}
