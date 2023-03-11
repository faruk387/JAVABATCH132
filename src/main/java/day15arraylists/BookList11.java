package day15arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList11 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        int counter=0;
        for(Integer w:myList){
            for(Integer k:myList){
                if(w==k){
                    counter++;
                }

            }

        }
        if(counter==myList.size()){
            System.out.println("there is no repetated element");
        }else{
            System.out.println("att least one repeated ");
        }
    }
}
