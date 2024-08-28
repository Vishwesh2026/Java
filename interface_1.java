
interface Operations{
    // every method you create is by default public and abstract 
    
    int factorial(int n); // public abstract int factorial(int n);    
}


class Math1 implements Operations{
public int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    } 
}

class Math2 implements Operations{
    public int factorial(int n){
           int f = 1;
           for( int i = 1;i<=n ;i++){
                f*= i;
           }
           return f;
    }
}

public class interface_1 {
    public static void main(String[] args) {
        
        Math1 m1 = new Math1();
        System.out.println(m1.factorial(6));
        Math2 m2 = new Math2();
        System.out.println(m2.factorial(7));
    }
}
