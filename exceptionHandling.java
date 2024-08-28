import java.lang.reflect.Method;
import java.sql.SQLException;

class Example{
    public static void printArray(String[] arr){
        for(String s:arr){
            System.out.println(s+" ");
        }
    }
    public static void printArray(Integer[] arr){
        for(Integer s:arr){
            System.out.println(s+" ");
        }
    }
    public static void printArray(Double[] arr){
        for(Double s:arr){
            System.out.println(s+" ");
        }
    }
}
public class exceptionHandling {
    public static void main(String[] args) {
        Method[] methods = Example.class.getDeclaredMethods();
        int c =0;
        for(Method m : methods){
            if(m.getName().equals("printArray")){
                c++;
            }
        }
        if(c>1){
            throw new RuntimeException("No Overloading is allowed");
        }
        String[] arr = { "Hello", "World" };
        Integer[] arr1 = { 1,2,3};
        Double[] arr2 = {1.1,2.2,3.3};
        Example.printArray(arr);
        Example.printArray(arr1);
        Example.printArray(arr2);
    }
}
/*      Checked                                               
1.Are the excpetions that will be verified during complie time .
2.with checked exceptions if not handled, your program will not even complile 
3.Sub--class of exception class

        Unchecked
1.Are the execeptions that will be verified during run-time
2.With these exceptions compilation will be successful
3.Sub-classes of RuntimeException class


 */