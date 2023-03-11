package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class BookList08 {
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);
        for(Integer w:h){
            if(w==7||w==10){
                continue;
            }else{
                h.set(h.indexOf(w),w+2);
            }
        }
        System.out.println(h);
    }
}
