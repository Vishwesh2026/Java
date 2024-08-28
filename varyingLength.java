public class varyingLength {
    public static void main(String[] args) {
      /*   int[] a, b, c; // all a,b,c, are integer arrays
        a = new int[5];  // Length of array 'a' is 5
        b = new int[5];

        int p[],q,r;  // this syntax says that the int array is applied only to the  p 
        p  = new int[10];   // Length of array 'p' is 10
        q = new int[10];
        r = new int[20];    
        */

        int [][] arr={{10,20},{20,30,40},{50,60,70,80}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
