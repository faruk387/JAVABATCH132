package day15arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookLists04 {
    public static void main(String[] args) {
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>(e);
        Collections.sort(f);
        int flag=0;
        for(int i=0;i<e.size();i++){
            if(f.get(i)==e.get(e.size()-1-i)){
                flag++;
            }

        }
        if(flag==e.size()){
            System.out.println("descending");
        }else{
            System.out.println("not descending");
        }
    }
}
