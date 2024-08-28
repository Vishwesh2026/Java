import java.util.ArrayList;

public class asList {
    public static void main(String[] args) {
        // ArrayList<ReferenceType> name = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
       // ArrayList<Cat> cats = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr); 
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.size());
        arr.add(0,200);
        System.out.println(arr);
        arr.set(3,100);
        System.out.println(arr);
        arr.remove((Integer)100);
        System.out.println(arr);
    }
}
