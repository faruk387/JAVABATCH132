package day26collectionsiterators;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

     /*
        Sets are for storing unique data.
        There are 3 sets i)HashSet: Uses hashing technique.
                                    Hashing technique is a technique to create unique data(code)
                                    HashSet does not put the elements in any order, so HashSet is so fast
                                    HashSet allows you to store just one "null" as value
                         ii)LinkedHashSet: LinkedHashSet puts the elements in "insertion order"
                                           that is why it is slower than HashSet
                         iii)TreeSet: TreeSet puts the elements in natural order, putting elements in natural order needs too much time
                                      that is why TreeSet is so slow.
     */


    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(3);
        hs.add(14);
        hs.add(5);
        hs.add(32);
        hs.add(1);
        hs.add(45);
        hs.add(19);
        hs.add(14);//When you add same element repeatedly,Java does not give error.It puts the repeated element just once into the set.
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(3);
        lhs.add(14);
        lhs.add(5);
        lhs.add(32);
        lhs.add(1);
        lhs.add(45);
        lhs.add(19);
        lhs.add(14);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        LinkedHashSet<Integer> myLhs=new LinkedHashSet<>();
        myLhs.add(12);
        myLhs.add(30);
        myLhs.add(14);
        myLhs.add(50);
        myLhs.add(32);
        boolean r1=lhs.retainAll(myLhs);//retainAll() method does not touch myLhs which is the method inside the parenthesis

        System.out.println(r1);//true
        System.out.println(lhs);//[12, 14, 32]
        System.out.println(myLhs);//[12, 30, 14, 50, 32]
 /*
            You have all products set, you have discounted products set
            You want to see discounted products in the all products set

            all products set ==> TV, Radio, Fridge, Watch, Laptop
            discounted products set ==> Radio, Laptop, Chair

            all products set.retainAll(discounted products set) ==> Radio, Laptop

            //Note: retainAll() can be used with HashSet, LinkedHashSet, and TreeSet as well
         */
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(13);
        ts.add(2);
        ts.add(24);
        ts.add(19);
        ts.add(5);
        ts.add(-3);
        System.out.println(ts);
          /*
            Interview Question: What do you use to store unique elements in natural order?
                                Answer: TreeSet

                                But as you know TreeSets are so slow, how can you prevent your code works slowly?
                                Answer: Create HashSet, add elements into the HashSet, then convert the HashSet to TreeSet
         */
        //Example: Store the following email addresses in alphabetical order
        //         abc@gmail.com, caf@gmail.com, acd@gmail.com, bcm@gmail.com, chi@gmail.com

        //1.Way

       long f1=System.nanoTime();
        TreeSet<String> email=new TreeSet<>();
       email.add("abc@gmail.com");
        email.add("caf@gmail.com");
        email.add("acd@gmail.com");
        email.add("bcm@gmail.com");
        email.add("chi@gmail.com");
        email.add("adc@gmail.com");
        email.add("cfs@gmail.com");
        email.add("cds@gmail.com");
        email.add("asc@gmail.com");
        email.add("gnh@gmail.com");
        System.out.println(email);
        long f2=System.nanoTime();


        //2. way
        HashSet<String> email1=new HashSet<>();
        email1.add("abc@gmail.com");
        email1.add("caf@gmail.com");
        email1.add("acd@gmail.com");
        email1.add("bcm@gmail.com");
        email1.add("chi@gmail.com");
        email1.add("adc@gmail.com");
        email1.add("cfs@gmail.com");
        email1.add("cds@gmail.com");
        email1.add("asc@gmail.com");
        email1.add("gnh@gmail.com");
        TreeSet<String> email2=new TreeSet<>(email1);
        System.out.println(email2);
        long f3=System.nanoTime();
        System.out.println("Just TreeSet: "+(f2-f1));
        System.out.println("HashSet with TreeSet: "+(f3-f2));






    }
}
