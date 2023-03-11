package b132practices.practice04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        //Example : Count the number of words starts with "s" in the String

        //String str= {"Learn Java earn money"};

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence, please");

        String str=input.nextLine();
        String[] strArr=str.split(" ");
        int counter=0;
        for(String w:strArr){
            if(w.startsWith("s")||w.startsWith("S")){
                counter++;
            }

        }
        System.out.println(counter);

    }
}
