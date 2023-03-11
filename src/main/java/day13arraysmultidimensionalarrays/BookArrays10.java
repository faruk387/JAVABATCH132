package day13arraysmultidimensionalarrays;

public class BookArrays10 {
    public static void main(String[] args) {
        String[] arr={"alabama", "pick", "sos", "sets", "pex"};
        int sum=0;
        for(String w:arr){
            sum=sum+w.length();
        }
        System.out.println(sum);
    }
}
