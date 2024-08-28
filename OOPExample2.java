
class Rectangle {
        double length,width;
        void printArea(){
            System.out.println("Area is "+ length*width);
        }
        void printPerimeter(){
            System.out.println("Perimeter is "+ 2*(length+width));
        }
}
public class OOPExample2 {
    public static void main(String[] args) {
        // Creating objects of the classes
        Rectangle r1 = new Rectangle();
        r1.length=4;
        r1.width=5;
        r1.printArea();
        r1.printPerimeter();
        
        Rectangle r2 = new Rectangle();
        r2.length=7;
        r2.width= 6;
        r2.printArea();
        r2.printPerimeter();
    }
}
