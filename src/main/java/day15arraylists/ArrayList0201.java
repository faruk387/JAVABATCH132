package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList0201 {
    public static void main(String[] args) {
        //Example 1: create an int list add 5element change elements less 10 to 77
        List<Integer> myList=new ArrayList<>();
        myList.add(13);
        myList.add(8);
        myList.add(25);
        myList.add(2);
        myList.add(10);
        for(Integer w:myList){
            if(w<10){
                myList.set(myList.indexOf(w),77);
            }
        }
        System.out.println(myList);
    }
}
