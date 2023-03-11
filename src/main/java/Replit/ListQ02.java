package Replit;

import java.util.ArrayList;
import java.util.List;

public class ListQ02 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Umit");
        names.add("Emin");
        names.add("Kemal");
        names.add("Kerem");
        names.add("Taylan");
        names.add("Orhan");
        names.add("Sinan");
        names.add("Furkan");
        names.add("Ahmet");
        names.add("Ali");
        System.out.println(names);
        String s=names.get(2);
        names.set(2, names.get(7));
        names.set(7,s);
        System.out.println(names);

    }
}
