public class JavaString1 {
    public static void main(String[] args) {
        //Character Arrays are mutable
        // Ability to be changed even after created
        // Strings are immutable 
        // char [] arr = { 'H', 'e', 'l', 'l', 'o' };
        // int [] arr1 = {10,20,30};
        // System.out .println(arr);
        // System.out.println(arr1);

        String s1 = "Hello";// Sting stored in String Constant Pool (SCP)
        String s2 = "Hello";// String stored in String Constant Pool (SCP)
        System.out.println(s1 == s2);
        String  s3 = new String("Hello");// Stored in Heap
        String  s4 = new String("Hello");// Stored in Heap
         System.out.println(s3 == s4);
         System.out.println(s1 == s3);
    }
}
