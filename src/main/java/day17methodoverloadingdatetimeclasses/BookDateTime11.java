package day17methodoverloadingdatetimeclasses;

import java.time.LocalTime;

public class BookDateTime11 {
    public static void main(String[] args) {
        LocalTime timeNow=LocalTime.now();
        if(timeNow.getHour()>0&&timeNow.getHour()<5){
            System.out.println("natt");
        }else if(timeNow.getHour()>8&&timeNow.getHour()<16){
            System.out.println("working time");
        }else if(timeNow.getHour()>19&&timeNow.getHour()<22){
            System.out.println("family time");
        }else{
            System.out.println("egen tid");
        }
    }

}
