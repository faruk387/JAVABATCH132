package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArraysList0201 {
    public static void main(String[] args) {
        //Example 1:Type code to print the elements of a list
        //if the element is greater then the number of elements in the list
        List<Integer> a=new ArrayList<>();
        a.add(5);
        a.add(9);
        a.add(3);
        a.add(4);
        a.add(6);
        List<Integer> a1=new ArrayList<>();
        for(Integer w:a){
            if(w>a.size()){
                a1.add(w);
            }
        }
        System.out.println(a1);
    }
}
