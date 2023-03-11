package Replit;

import java.util.ArrayList;
import java.util.List;

public class ListQ04 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ayse");
        names.add("Fatma");
        names.add("Omer");
        List<String> filteredNames=new ArrayList<>();
        for(String w:names){
            if(!w.contains("A")&&!w.contains("a")){
              filteredNames.add(w);
            }
        }
        System.out.println(filteredNames);


    }
}
