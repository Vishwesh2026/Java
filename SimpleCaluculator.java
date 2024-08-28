import java.util.Scanner;
class SimpleCalculator
{
    public static int cal()
    {
        System.out.println("1. Add\n 2. Sub\n 3. mul\n 4. Div\n Enter your choice: ");
        int cho,x,y;
        Scanner sc=new Scanner(System.in);
        cho=sc.nextInt();
        System.out.println("Enter two number: ")
        x=sc.nextInt();
        y=sc.nextInt();
        switch(cho)
        {
            case 1: return x+y;
            case 2: return x-y;
            case 3: return x*y;
            case 4: return x/y;
            default:System.out.println("Invalid input, choose btw 1 to 4");
        }
    }
}
public static void main(String args[])
{
    int Result= SimpleCalculator.cal();
    if(Result!=MIN_VALUE)
    System.out.println(Result);
}