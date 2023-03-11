package b132practices.practice08;

public class Runner {
    //Type a code to calculate area of rectangle and triangle.(use abstraction)
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        Triangle tri=new Triangle();
        System.out.println(rec.area(5,7.2));
        System.out.println(tri.area(12.5,20.7));
    }
}
