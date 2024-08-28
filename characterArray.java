import java.util.Arrays;

public class characterArray {
 public static void main(String[] args) {
       
       String s ="Hello";
       char[] arr = s.toCharArray();
       Arrays.sort(arr);
       String sortedString = new String(arr);
       System.out.println(sortedString);
 }   
}
