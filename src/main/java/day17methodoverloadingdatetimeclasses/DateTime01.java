package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        //Type code to get current date
        Date currentDate = new Date();
        System.out.println(currentDate);
        System.out.println(currentDate.getTime());
        // 1674611869700 millisecond.
        // Milliseconds from "January 1st 1970" to the "current time"
        //Type code to get current time in your local area
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime); // 21:03:45.808889 ==> Current time ==> Hours:Minutes:Seconds:NanoSeconds
        //Type code to get current date in your local area
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);// 2023-01-24
        //Type code to get current date and current time in your local area
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);//2023-01-24T21:09:11.575209
        //How to get a specific component from date and time
        System.out.println(myDate.getMonthValue());//1
        System.out.println(myDate.getDayOfMonth());//Janaury
        System.out.println(myDateTime.getDayOfWeek());//Tuesday'
        //How to get time in another time zone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-26T03:02:23.034207300
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul")));//2023-01-25T21:02:23.034207300
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Stockholm")));//2023-01-25T19:03:26.718705700
        //How to go future or past in date and time
        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12));
        System.out.println(myTime.minusHours(3).minusMinutes(20));//15:46:21.035031600

        //How to compare two dates
        LocalDate firstKidDob=LocalDate.of(2005,8,23);
        LocalDate secondKidDob=LocalDate.of(2011,3,11);
        boolean isFirstKidAfter= firstKidDob.isAfter(secondKidDob);
        System.out.println(isFirstKidAfter);
        boolean isFirstKidBefore=firstKidDob.isBefore(secondKidDob);
        System.out.println(isFirstKidBefore);
        boolean isFirstKidEqualsToSecondKid=firstKidDob.isEqual(secondKidDob);
        System.out.println(isFirstKidEqualsToSecondKid);
        //How to format Date
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String formattedMyDate=dtf.format(myDate);
        System.out.println(formattedMyDate);
        //d-->1, 2, 3,..., 10, 11, 12,.., 31
        //dd -->01, 02, 03,..., 10, 11, 12, ... , 31
        //M-->1, 2, 3,..., 10, 11, 12
        //MM -->01, 02, 03,..., 10, 11, 12
        //MMM--> Jan , Feb, Mar, ... , Dec
        //MMMM --> January, February, ... , December
        //yy --> 23
        //yyyy --> 2023

        //How to format Time
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm a");
        String formattedTime=dtf1.format(myTime);
        System.out.println(formattedTime);
        //HH --> 24 hours system
        //hh --> 12 hours system
        //After time pattern leave a space put "a" it puts AM or PM next to the time

    }
}
