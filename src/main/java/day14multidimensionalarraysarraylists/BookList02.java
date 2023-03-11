package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList02 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum=0;
        Collections.sort(myList);
        for(Integer w:myList){
            if(w<13){
                sum=sum+w;
            }
        }
        System.out.println(sum);
    }
}
