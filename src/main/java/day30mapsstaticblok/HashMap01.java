package day30mapsstaticblok;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
String s="Java is easy, Java is OOP, OOP makes Java easy.";
        System.out.println(getNumOfOccurence(s));
    }
    //Example 1: Type code to find the number of occurrences of words in a sentence
    //           Java is easy,Java is OOP,OOP makes Java easy. ==>Java=3,is=2,easy=2,OOP=2,makes=1
    //Java is easy,Java is OOP,OOP makes Java easy.==> Java is easy Java is OOP OOP makes Java easy
    public static HashMap<String, Integer> getNumOfOccurence(String s){
        //To make "easy",and "easy," same, i removed puctuation marks
        s=s.replaceAll("\\p{Punct}","");
       //To put result into a map i created following HashMap
        HashMap<String,Integer> occurences=new HashMap<>();
        //I split the String to get words then put them into the words array
        String[] words=s.split(" ");
        for(String w:words){
            Integer numOfOccurrences=occurences.get(w);
            if(numOfOccurrences==null){
                occurences.put(w,1);
            }else{
                occurences.replace(w,numOfOccurrences+1);
            }
        }
       return occurences;

    }

}
