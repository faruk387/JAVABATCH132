package day08ternaryswitch;

public class BookTernary04 {
    public static void main(String[] args) {
        // Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary
        int i = 14;
        String result = i%2==0 ? "Even" : "Odd";
        System.out.println(result);
        //If the number is positive print ‘Positive’, otherwise print ‘Not positive’ on the console by
        //using ternary
        int l = -12;
        String result1 = l>0 ? "Positive" : "Not positive";
        System.out.println(result1);
    }
}
