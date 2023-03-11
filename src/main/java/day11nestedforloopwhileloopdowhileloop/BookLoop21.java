package day11nestedforloopwhileloopdowhileloop;

public class BookLoop21 {
    public static void main(String[] args) {
        int p=12133455;
        String r=String.valueOf(p);
        int sum=0;
        for(int i=0;i<r.length();i++){
            if(r.indexOf(r.substring(i,i+1))==r.lastIndexOf(r.substring(i,i+1))){
                sum=sum+Integer.valueOf(r.substring(i,i+1));
            }

        }
        System.out.println(sum);
    }
}
