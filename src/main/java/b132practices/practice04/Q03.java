package b132practices.practice04;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        //Type code to check if a specific element in an Array or not
        //String[] s=new String[6];
        String[] str={"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};
        Arrays.sort(str);;
        System.out.println(Arrays.binarySearch(str,"Brad"));
        int counter=0;
        for(String w:str){
            if(w=="Alicd"){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
