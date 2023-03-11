package day15arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        /*
        1)What it is
2)Why it is
3)Simple implementation
4)Mid level implementation
5)Advanced level implementation
6)Do mini projects
7)Regular projects
         */
        //Example 1: create an int list add 5element change elements less 10 to 77
        List<Integer> myList=new ArrayList<>();
        myList.add(13);
        myList.add(8);
        myList.add(25);
        myList.add(2);
        myList.add(10);
        System.out.println(myList);
        //first way
        for(int i=0;i<myList.size();i++){
          if(myList.get(i)<10){
                myList.set(i,77);
            }

        }
        System.out.println(myList);

        for(Integer w:myList){
            if(w<10){

                myList.set(myList.indexOf(w),77);
            }

        }
        System.out.println(myList);
        //Create an integer list remove the duplicated element
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
//1.way for each loop
        List<Integer> a1=new ArrayList<>();
        for(Integer w:a){
            if(!a1.contains(w)){
                a1.add(w);
            }

        }
        System.out.println(a1);
        //2 way

        for(int i=0;i<a.size();i++){
            Integer el=a.get(i);
            if(a.indexOf(el)!=a.lastIndexOf(el)){
                a.remove(el);
                i--;
            }
        }
        System.out.println(a);

    }
}
