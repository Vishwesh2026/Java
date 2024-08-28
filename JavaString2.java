import java.util.Arrays;

public class JavaString2 {
    public static void main(String[] args) {
        String s ="Hello";
        String s1 = "abc";
        String s2 = "abe";
        String x = :
        System.out.println(s.length() + " : " + s); // 5 : Hello
        System.out.println(s.charAt((2)));
        System.out.println(s.toUpperCase()+ " : "+ s.toLowerCase());// HELLO : hello
        System.out.println(s.substring(2)); // llo
        System.out.println(s); //Original String won't be changed as it's immutable
       System.out.println(s.contains(""+'H'));
       System.out.println(s.indexOf('H'));
       System.out.println(s.lastIndexOf('o'));
       System.out.println(s.startsWith("Hel"));
       System.out.println(s.endsWith("llo"));
       System.out.println(s.substring(1, 3));
       System.out.println(s.substring(4));
       char[] arr = s.toCharArray();
       Arrays.sort(arr);
       String sortedString = new String(arr);
       System.out.println(sortedString);
    }   
}
