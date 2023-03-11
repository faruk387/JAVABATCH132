package day11nestedforloopwhileloopdowhileloop;

public class BookLoop02 {
    public static void main(String[] args) {
        //Type code to print repeated characters in a String. For example; accessories ⇒ ce
        //for loop
        String s="accessories";
        String d="";
        for(int i=0;i<s.length();i++){
           String c=s.substring(i,i+1);
           if(s.indexOf(c)!=s.lastIndexOf(c)){
               if(!d.contains(c)){
                   d=d+c;
               }
           }
        }
        System.out.println(d);
        //while loop
        String s1="accessories";
        String d1="";
        int k=0;
        while(k<s1.length()){
            String c=s1.substring(k,k+1);
            if(s1.indexOf(c)!=s1.lastIndexOf(c)){
                if(!d1.contains(c)){
                    d1=d1+c;


                }

            }
            k++;
        }
        System.out.println(d1);
        //do while
        int i=0;
        do{
            String c=s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                if(!d.contains(c)){
                    d=d+c;
                }
            }

         i++;
        }while(i<s.length());
        System.out.println(d);
    }
}
