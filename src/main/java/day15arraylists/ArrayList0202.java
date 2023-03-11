package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList0202 {
    public static void main(String[] args) {
        //Create an integer list remove the duplicated element
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        for(int i=0;i<a.size();i++){
            if(a.indexOf(a.get(i))!=a.lastIndexOf(a.get(i))){
                a.remove(a.get(i));
                i--;
            }
        }
        System.out.println(a);

    }
}
