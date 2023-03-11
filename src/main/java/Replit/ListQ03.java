package Replit;

import java.util.ArrayList;
import java.util.List;

public class ListQ03 {
    public static void main(String[] args) {
        String s="It is very nice to write code.";
        List<String> s1= List.of(s.split(""));
        List<String> s2=new ArrayList<>();
        System.out.println(s1);
        for(int i=s1.size()-1;i>=0;i--){
            s2.add(s1.get(i));


        }
        System.out.println(s2);

    }
}
