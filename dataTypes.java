import java.lang.*;
import  java.util.Scanner;
class MyClass{

       public static void main(String[] args)
     {
	float x=1.2f;
	System.out.println(x);
	long y=121233324343l;
	System.out.println(y);
	float z=1.2343f;
	System.out.printf("%.3f\n",x); // adjusting to 3 decimal places
	Scanner sc = new Scanner(System.in);
	  String s = sc.next(); // without spaces
	  String a = sc.nextLine(); //with spaces
	  System.out.println(s);
	  System.out.println(a);
	
     }
}


 