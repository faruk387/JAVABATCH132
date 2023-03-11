package day04stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Get the first 4 characters from a String and convert them to lower cases
        //           Albania ==> Alba ==> alba
        String s="Germany";
        s=s.toLowerCase().substring(0,4);//first int in,second int ex.
        System.out.println(s);
        //Example 2: Check if two Strings are same or not?

        String r="Java";
        String u="java";
        boolean sameEqualSign= r==u;
        System.out.println(sameEqualSign);//false becuse values are diffrerent
        boolean b=r.equals(u);
        System.out.println(b);
        boolean c=r.equalsIgnoreCase(u);//false because values are different
        System.out.println(c);
        //Question: Why don't we use "==" to compare Strings?
        //1.Scenario: "==" and "equals()" gives you the same output
        String s1="TechPro";
        String s2="TechPro";
        boolean r1=s1==s2;
        System.out.println(r1);
        boolean r2=s1.equals(s2);
        System.out.println(r2);
        //2.Scenario: "==" and "equals()" gives you different output
        String t1="Python";
        String t2=new String("Python");
        boolean d1=t1==t2;
        System.out.println(d1);
        boolean d2=t1.equals(t2);
        System.out.println(d2);


    }
}
