package day09forloops;

public class BookForLoop01 {
    public static void main(String[] args) {

        for(Integer i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }
       //Type code to print repeated characters in a String. For example; accessories ⇒ ces
        System.out.println();
        String a="accessories";

        for(int i=0;i<a.length();i++){
            if(a.indexOf(a.charAt(i))!=a.lastIndexOf(a.charAt(i))){

                System.out.print(a.charAt(i));
            }

        }
        System.out.println();
        String s="runnur";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
           s1=s1+s.charAt(i);

        }
        if(s1.equals(s)){
            System.out.println("Pelig");
        }else{
            System.out.println("not peliq");
        }
        System.out.println();
        int b=223878;
        String r=String.valueOf(b);
        for(int i=0;i<r.length();i++){
            if(r.indexOf(r.charAt(i))==r.lastIndexOf(r.charAt(i))){
                System.out.print(r.charAt(i)+" ");
            }
        }


    }
}
