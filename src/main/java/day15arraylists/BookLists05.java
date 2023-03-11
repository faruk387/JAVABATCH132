package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class BookLists05 {
    public static void main(String[] args) {
        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);
        for(Integer w:g){
            if(g.contains((Integer)15)){
                g.set(g.indexOf(15),51);
            }
        }
        System.out.println(g);
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        for(Integer w:h){
            if(h.contains((Integer)15)){
                h.remove(h.indexOf(15));

            }
        }
        System.out.println(h);
    }
}
