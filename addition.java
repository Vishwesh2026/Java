import java.lang.*;
import  java.util.Scanner;
class MyClass{

       public static void main(String[] args)

     {
	//creating an object
	// classname objectname = new classname()
	//Object if Scanner class
	  Scanner sc = new Scanner(System.in);
	  int a= sc.nextInt();
	  int b= sc.nextInt();	
          System.out.println("Sum of "+ a +" and " +b+ " is " +(a+b));
          System.out.printf("\nSum of %d and %d is %d",a,b,a+b);
     }
}
 