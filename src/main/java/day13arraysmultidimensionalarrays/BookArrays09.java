package day13arraysmultidimensionalarrays;

public class BookArrays09 {
    public static void main(String[] args) {
        String[] arr={"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s="Object";
        int counter=0;
        for(String w:arr){
            if(w.equalsIgnoreCase(s)){
                counter++;
            }
        }
        System.out.println(counter);
        if(counter>0){
            System.out.println("exist");
        }else{
            System.out.println("doesnt exist");
        }

    }
}
