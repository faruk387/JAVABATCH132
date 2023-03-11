package b132practices.practice05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
         /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
        List<Integer> num= Arrays.asList(12,5,8,13);
        Collections.sort(num);
        if(num.size()%2!=0){
           int middle= num.get(num.size()/2);
            System.out.println(middle);
        }else{
            int middle=(num.get(num.size()/2)+num.get(num.size()/2-1))/2;
            System.out.println(middle);
        }

    }

}
