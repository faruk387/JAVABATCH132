package day26collectionsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
      /*
        1)Iterators do the same with the loops
        2)Loops have infinite loop risk but Iterators do not have
        3)There are not performance difference between loops and iterators
        4)Iterators are more successful in removing elements and updating elements in a collection

        5)There are two types of iterators i)Iterator: It can "just remove" the elements, it is impossible to update and add.
                                                       It works just from left to the right
                                           ii)ListIterator: It can remove and update and add the elements
                                                            It works just from left to the right and right to left
     */
      public static void main(String[] args) {

            List<String> myList = new ArrayList<>();
            myList.add("Tom");
            myList.add("Jim");
            myList.add("Clara");
            myList.add("Angie");
            myList.add("Mark");
            System.out.println(myList);// [Tom, Jim, Clara, Angie, Mark]

            Iterator<String> myItr=myList.iterator();
            while(myItr.hasNext()){
                  myItr.next();
                  myItr.remove();
            }
            System.out.println(myList);
            //Let us use ListIterator:
            List<String> yourList = new ArrayList<>();
            yourList.add("Tom");
            yourList.add("Jim");
            yourList.add("Clara");
            yourList.add("Angie");
            yourList.add("Mark");
            System.out.println(yourList);
            ListIterator<String> yourListItr= yourList.listIterator();
            while(yourListItr.hasNext()){
                  String el=yourListItr.next();
                  yourListItr.set(el+"!...");
            }
            System.out.println(yourList);
            //Example: Print the yourList elements on the console from the last element to the first element
            //         in the same line with a space between two consecutive elements
            List<String> ourList = new ArrayList<>();
            ourList.add("Tom");
            ourList.add("Jim");
            ourList.add("Clara");
            ourList.add("Angie");
            ourList.add("Mark");
            System.out.println(ourList);// [Tom, Jim, Clara, Angie, Mark]
            ListIterator<String> ourListItr=ourList.listIterator();
            //Following loop will move the pointer to the very end
            while(ourListItr.hasNext()){
                  ourListItr.next();
            }
            //Following loop will work from the last element to the first element
            while(ourListItr.hasPrevious()){
                  String el1=ourListItr.previous();
                  System.out.print(el1+" ");

            }

      }

}
