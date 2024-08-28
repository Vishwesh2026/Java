
class cat {
 String name;
    cat(String name) {
    this.name= name;
 }
    
}
public class exception_handling {
    public static void main(String[] args) {

        try {
         int[] arr = {10,30};
         System.out.println(arr[2]);
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } 
       
       /*  catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error: Trying to access an element beyond the array length");  
        }*/
        
        finally{
             System.out.println("The end of the code");
        }
    }
}



/*
  Control flow in try catch 
  try {
    statement1;
    statement2;
    statement3;
  }
  catch(X e){
    statement 4;
  }
  statement 5;

  Case1 : When there is no execption raised in try block 1,2,3 and 5 gets executed 

  Case2 : If there is an exception at statement 1 and catch block is having corresponding handler - 4 & 5 gets executed 

  Case3 : If there is an exception at statement 1 and catch block is not having corresponding handler - program crashes after statement 1

 */