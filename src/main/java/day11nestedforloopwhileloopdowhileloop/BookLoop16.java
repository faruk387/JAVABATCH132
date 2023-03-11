package day11nestedforloopwhileloopdowhileloop;

public class BookLoop16 {
    public static void main(String[] args) {
        String s="Christmas";
        String result="";
        for(int i=0;i<s.length();i++){
            String c=s.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
            result=result+c;
        }
        System.out.println(result);
    }
}
