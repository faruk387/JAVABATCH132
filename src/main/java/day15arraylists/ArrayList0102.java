package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList0102 {
    public static void main(String[] args) {
        //Example 3: Create a String List, add 5 elements, remove element whose length less then 6
        List<String> n=new ArrayList<>();
        n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        List<String> n1=new ArrayList<>(n);
        System.out.println(n);
        for(String w: n1){
            if(w.length()<6){
                n.remove(w);
            }
        }
        System.out.println(n);
    }
}
