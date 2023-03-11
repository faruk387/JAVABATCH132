package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Create a String list, add 5 elements into the list, remove a specific element from the list.

        List<String> names=new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        System.out.println(names);

        names.remove("Alex");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);

        //Example 2: Create an integer list ,add 6 elements, remove spec element
        List<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);
        System.out.println(ages);
        //if you put an integer into remove() method paretnhesis java accaepts the integer as primitive int.
        //if the number you put inside the () is primitive int, it will be index.
        //to fix that problem change primitive int to wrapper class by suin(Integer)13

        ages.remove((Integer)13);
        System.out.println(ages);
        //Example 3: Create a String List, add 5 elements, remove element whose length less then 6
        List<String> n=new ArrayList<>();
       n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
      n.add("Adriana");
        n.add("Tom");
        System.out.println(n);
        //first way
        for(int i=0;i<n.size();i++){
            if(n.get(i).length()<6){
                n.remove(n.get(i));
                i--;
            }
        }
        System.out.println(n);
        //second way
        List<String> n1=new ArrayList<>(n);
        for(String w:n1){
            if(w.length()<6){
             n.remove(w);
            }
        }
        System.out.println(n);

    }
}
