package day11nestedforloopwhileloopdowhileloop;

public class BookLoop04 {
    public static void main(String[] args) {
        //ype code to print the unique digits in an integer. Example; 223878 ⇒ 37
        //for
        Integer num=223878;
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){

            if(s.indexOf(s.substring(i,i+1))==s.lastIndexOf(s.substring(i,i+1))){
                System.out.print(s.charAt(i)+"");
            }
        }
        System.out.println();
        //while
        Integer num1=223878;
        String s1=String.valueOf(num1);
        String d="";
        int k=0;
        while(k<s1.length()){
            if(s1.indexOf(s1.substring(k,k+1))==s1.lastIndexOf(s1.substring(k,k+1))){
            d=d+s1.charAt(k);


            }
            k++;

        }
        System.out.print(d);
        //do while
        System.out.println();
        Integer num2=223878;
        String s2=String.valueOf(num2);
        String d1="";
        int k1=0;
        do {
            if (s2.indexOf(s2.substring(k1, k1 + 1)) == s2.lastIndexOf(s2.substring(k1, k1 + 1))) {
                d1 = d1 + s2.charAt(k1);


            }
            k1++;
        }while (k1<s2.length()) ;

        System.out.println(d1);

    }
}
