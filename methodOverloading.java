public class methodOverloading {
    static void add(int a,int b){
        System.out.println(a+b);
    }

    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    
    static void add(double a,double b){
        System.out.println(a+b);
    }

    static void add(int[] arr, int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
    public static void main (String[] args) {
        //code
        add(5.5,6.6);
        add(5, 10);
        add(5, 10, 15);
       /* int  arr[]={1,2,3,4,6};
        add(arr, 5);*/ 
        add(new int[]{1,2,3,4,5},5);
    }
}
// Method Overloading cannot be done with different  data types but can be achieved through the use of methods having same name but different parameters.