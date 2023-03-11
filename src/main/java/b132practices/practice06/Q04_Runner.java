package b132practices.practice06;

public class Q04_Runner {
    public static void main(String[] args) {
   Volume volume=new Volume();
        System.out.println("Volume if Cylinder is: "+volume.volumeOfCylinder(5,10));
        System.out.println("Volume Of Rectangular Prism: "+volume.volumeOfRectangularPrism(4,5,11.5));
   Area area=new Area();
        System.out.println("Area of square: "+ area.areaOfASquare(5));

    }
}
