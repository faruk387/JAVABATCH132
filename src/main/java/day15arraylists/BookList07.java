package day15arraylists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList07 {
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);
        int minDiff = h.get(2) - h.get(1);
        for(int i=1; i<h.size(); i++){
            minDiff = Math.min(minDiff, h.get(i)-h.get(i-1));
        }
        for(Integer i=1; i<h.size(); i++){
            if(h.get(i)-h.get(i-1) == minDiff){
                System.out.println(h.get(i) + " and " + h.get(i-1));
            }
        }
    }
}
