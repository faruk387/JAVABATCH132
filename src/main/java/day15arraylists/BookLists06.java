package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class BookLists06 {
    public static void main(String[] args) {


        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        for (int i=0;i<h.size();i++) {
            if (h.get(i) == 15) {
                h.remove(h.indexOf(15));
                i--;
            }


                if(h.get(i)==13){
               h.remove(h.indexOf(13));
                    i--;

           }

        }
        System.out.println(h);

    }
}
