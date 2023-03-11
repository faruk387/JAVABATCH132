package day07ifstatementsternarystatements;

public class BookIf02 {
    public static void main(String[] args) {
        int a=24;
        if(a%10<5){
            System.out.println(a-a%10);
        }else{
            System.out.println(a+(10-a%10));
        }
    }
}
