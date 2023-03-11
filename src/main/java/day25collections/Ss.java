package day25collections;

import java.util.HashSet;

public class Ss {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>();
        h1.add((int)(Math.random()*51));
        h1.add((int)(Math.random()*51));
        h1.add((int)(Math.random()*51));
        h1.add((int)(Math.random()*51));
        h1.add((int)(Math.random()*51));
        System.out.println(h1);
        HashSet<Integer> h2=new HashSet<>();
        h2.add((int)(Math.random()*13));
        h2.add((int)(Math.random()*13));
        System.out.println(h2);
    }
}
