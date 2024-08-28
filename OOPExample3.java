
class Circle {

    double radius;
    static final double  PI = 3.14; //(U can use the Math.PI instead of this also) it allowcates the memory of the circle  constant to be shared among all instances of the Circle class
    void printDiameter(){
    System.out.println("The diameter of the circle is " + (2*radius));
    }
    void printArea(){
        System.out.println("Area is "+ (Math.PI * Math.pow(radius, 2)));
    }
    void printPerimeter(){
        System.out.println("Perimeter is "+ (2*Math.PI*radius));
    }
}
public class OOPExample3 {
public static void main(String[] args) {
    // Creating objects of the classes
    Circle r1 = new Circle();
    r1.radius=4;
    
    // Calling methods using these objects
    r1.printDiameter();
    r1.printArea();
    r1.printPerimeter();

}
}
