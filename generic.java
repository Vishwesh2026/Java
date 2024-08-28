import javax.print.DocFlavor.STRING;

/**
 * Cat
 */
class Cat{
    String name;
    int age;
    Cat(){}
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "this is"+ name + "(" + age +")";
    }
    
}
public class generic {

    static void printArray(Integer[] A) {
        for(Integer val:A){
            System.out.println(val+" ");
        }
        System.out.println();
    }
static void printArray(Character[] C){
        for(Character val:C){
            System.out.println(val+" ");
        }
        System.out.println();
}
static void printArray(Double[] D){
    for(Double val:D){
        System.out.println(val+" ");
    }
    System.out.println();
}
static void printArray(Cat[] X){
    for(String val:X){
        System.out.println(val+" ");
    }
    System.out.println();
}

public class genericMethod{
    static <T> void printArray(T[] arr){
        for(T val:arr){
            System.out.println(val + " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        

      /*  char ch = 'z';
        System.out.println(ch);
        Character ch1 = 'Z';
        System.out.println(ch1);
       */

        Integer[] arr = {10,20,30,40};
        printArray(arr);
        Character[] arr1 = {'z','?','x','y'};
        printArray(arr1); 
        Double[] arr2 = {1.2, 1.4, 1.4, 1.7};
        printArray(arr2);
        Cat[] cats = {new Cat("Alice",7),new Cat("bod",4)};
        printArray(cats);

    }
}
