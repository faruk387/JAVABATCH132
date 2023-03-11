package Replit;

public class ForQ05 {
    public static void main(String[] args) {
        printNumbers(0,20);
    }
    static void printNumbers(int a,int n) {
        if(n >= a) {
            printNumbers(a+2,n);
            System.out.print(a + " ");
        }
        return;
    }
}
