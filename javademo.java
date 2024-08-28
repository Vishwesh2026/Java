class A
{
int a=10;
final void display()
{
System.out.println("I am display() of class-A");
System.out.println("my value is:"+a);
}
}
class B extends A
{
int b=20;
void display() //can’t be overriden
{
System.out.println("I am display() of class-B");
System.out.println("my value is:"+b);
}
}
class javademo
{
public static void main(String args[])
{
B b=new B();
b.display();
}
}
