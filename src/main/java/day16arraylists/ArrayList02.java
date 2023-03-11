package day16arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500, 6400, 2300, 5000, 7150] ==> 4500-->4950 - 2300-->2530
        //           [4950, 6400, 2530, 5000, 7150]
        List<Double> salary=new ArrayList<>();
        salary.add(4500.0);
        salary.add(6400.0);
        salary.add(2300.0);
        salary.add(5000.0);
        salary.add(7150.0);
        System.out.println(salary);
        for(Double w:salary){
            if(w<5000.0){
                salary.set(salary.indexOf(w), w*1.1);
            }
        }
        System.out.println(salary);
    }
}
