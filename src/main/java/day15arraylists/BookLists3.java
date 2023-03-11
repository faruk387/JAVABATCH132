package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class BookLists3 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int m=1;
        for(Integer w:myList){
            if(w%2==0){
                m=m*w;
            }


        }
        System.out.println(m);
    }
}
