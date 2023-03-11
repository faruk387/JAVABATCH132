package b132practices.practice06;

import java.util.Arrays;

public class Q0202 {
    //Convert the "Congratulations" word to "sn**t*l*rgn*C" by using Array methods.
    public static void main(String[] args) {
        String s="Congratulations";
        String[] s1= s.split("");
        System.out.println(Arrays.toString(s1));
        String s2="";
        for(int i=s1.length-1;i>=0;i--){
            if(s1[i].equalsIgnoreCase("a")||s1[i].equalsIgnoreCase("e")||
                    s1[i].equalsIgnoreCase("o")||s1[i].equalsIgnoreCase("u")){
                s1[i]="*";
            }
            s2=s2+s1[i];

        }
        System.out.println(s2);
    }
}
