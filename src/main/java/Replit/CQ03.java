package Replit;

public class CQ03 {
    public static void main(String[] args) {
        CQ03 c1=new CQ03();
        CQ03 c2=new CQ03(3);
    }
    public CQ03(){
        System.out.println("first constructor");
    }
    public CQ03(int a){
        System.out.println("second constructor");
    }
}
