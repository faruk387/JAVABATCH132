package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class BookList09 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double sum=0;
        for(String w: myList){
           Double price=Double.valueOf(w.replace("$",""));
           sum=sum+price;

            }
        System.out.println(sum);

    }
}
