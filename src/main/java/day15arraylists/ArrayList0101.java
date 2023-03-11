package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList0101 {
    public static void main(String[] args) {
        //Example 1: Create a String list, add 5 elements into the list, remove a specific element from the list.

        List<String> names=new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        System.out.println(names);
        names.remove("Tom");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        //Example 3: Create a String List, add 5 elements, remove element whose length less then 6
        List<String> n=new ArrayList<>();
        n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        System.out.println(n);

        for(int i=0;i<n.size();i++){
            if(n.get(i).length()<6){
                n.remove(i);
                i--;
            }
        }
        System.out.println(n);
    }
}
