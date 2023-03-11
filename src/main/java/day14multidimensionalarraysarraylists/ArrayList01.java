package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
    /*
    1)To create an array we need to declare "the number of elements" at the beginning but
      we may need more elements to store or less elements to store inside the array.
      That is way declaring the number of element att the beginning is not good.
      This is the negative side of arrays.

      To remove that negativity,Java created a new structure whose name is "ArrayList",
      when we use "ArrayList", no need to declare the number of elements you want to store in it.

      As a result; "Array" is fixed in length,"ArrayList" is flexible
     2) "ArrayList" can store just "non-primitive" data ,"Array" can store "primitive" data and "reference".

     3)"Arrays" work super fast.
       "Arrays" use memory sp less.
        If you are sure the number of elements will not change(For example month names), using "Array" is better

     */
    public static void main(String[] args) {
//How to create an ArrayList
        //First way
        ArrayList<Integer> ages=new ArrayList<>();
        System.out.println(ages);
        //Second way
        List<Integer> prices=new ArrayList<>();
        System.out.println(prices);
        //how to add elements in ArrayList
        //Note: add() method puts the element att the end.
        //      add() method put the element in "insertion order"
        ages.add(13);
        ages.add(9);
        ages.add(21);
        System.out.println(ages);
        ages.add(1,44);

        System.out.println(ages);
        prices.add(330);
        prices.add(550);
        prices.add(770);
        System.out.println(prices);
        ages.addAll(prices);
        System.out.println(ages);
        ages.addAll(2,prices);
        System.out.println(ages);
        //how to remove all elements from a list

        //prices.clear();
        //System.out.println(prices);
        //how to check elements exist
        boolean r1=ages.contains(44);
        System.out.println(r1);

        boolean r2=ages.containsAll(prices);
        System.out.println(r2);
        //how to check if 2 lsit are same or not
       boolean r3= ages.equals(prices);
        System.out.println(r3);
        List<String> names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Angie");
        names1.add("Mark");
        List<String> names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Angie");
        names2.add("Mark");
        boolean r4= names1.equals(names2);
        System.out.println(r4);
        //Example 1: Type code to check if 2 list have same elements
        //elements can be in different indexes
        List<Character> a1=new ArrayList<>();
        a1.add('A');
        a1.add('B');
        a1.add('C');
        Collections.sort(a1);
        List<Character> a2=new ArrayList<>();
        a2.add('B');
        a2.add('C');
        a2.add('A');
        Collections.sort(a2);
        boolean r5=a1.equals(a2);
        System.out.println(r5);









    }
}
