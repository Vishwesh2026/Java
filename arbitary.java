public class arbitary {
    static void add(int ... shadow){
        int sum=0;
        for(int i =0 ; i<shadow.length;i++){
            sum += shadow[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(20,30);
        add(20,30,40);
        add(20,30,40,50);
    }
}
