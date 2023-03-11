package day12arrays;

import java.util.ArrayList;
import java.util.List;

public class BookArrays08 {
    public static void main(String[] args) {
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        List<String> s= new ArrayList<>();
        for(String w: arr){
            if(w.charAt(0)==w.charAt(w.length()-1)){
                s.add(w);
            }
        }
        System.out.println(s);

    }
}
