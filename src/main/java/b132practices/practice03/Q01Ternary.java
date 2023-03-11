package b132practices.practice03;

public class Q01Ternary {
    public static void main(String[] args) {
        //Type code to check if a number is positive or not
        int i=23;
        if(i>=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        String s=i>=0?"Positive":"Negative";
        System.out.println(s);
        //Type code to check if an integer has 3 digits or not==> Boundary Value Analysis--> -1000, -999, 100, -99, 0, 99, 999, 1000
        int i1=-999;
        int absI1=Math.abs(i1);
        if(absI1>99&&absI1<1000){
            System.out.println("3 digits");
        }else{
            System.out.println("not 3 digits");
        }
        String s1=absI1>99&&absI1<1000?"3 digit":"Not 3 digit";
        System.out.println(s1);

    }
}
