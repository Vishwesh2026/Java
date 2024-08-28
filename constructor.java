import javax.swing.JOptionPane;

class Student {
    String name ;
    int level;
    String  Place;
    double critRate;
    // constructor
  /*  Student() // default constructor ---> no parameter constructor 
    {
        System.out.println("Come forth");
    } */
    Student(String n)//parameterized constructor
    {
            name = n;
            System.out.println("My name is "+ n + " my level "+ " is Limitless");
    }
    Student(String n,int l,String p,double c)//parameterized constructor
    {
            name = n;
            level =l;
            Place=p;
            critRate=c;
            System.out.println("My name is "+ n + " my level "+ " is "+ l+ ". I live in"+" "+ p+". Crit-Rate of "+c);
    }
    Student(String n,int l,String p)//parameterized constructor
    {
            name = n;
            level =l;
            Place=p;
           
            System.out.println("My name is "+ n + " my level "+ " is "+ l+ ". I live in"+" "+ p);
    }


    // Frame(){
    //     JOptionPane.showMessageDialog(null, "constructor trigger", "Hello", " level up");
    // }


}
public class constructor {
    public static void main(String[] args) {
        Student s = new Student("SUNG JINWOO");
        Student s1 = new Student("Igris", 9, "Unkown dungeon");
        Student s2 = new Student("Beru", 10, "jenjuIsland", 74.2);


  //   new Frame();   
    }
}
