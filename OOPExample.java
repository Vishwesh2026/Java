class Person{
    // member  variable 
    String name;// non-static/instance member
    int age;// non-static/instance member
    String job;
    void printDetails(){
        System.out.println("My name is "+ name + " and I am a "+job+" and my age is "+age+" years old");
    }
}


public class OOPExample {
    public static void main(String[] args){
        Person p1 = new Person();//  Creating an object of Person
        /* Accessing the member variables using dot operator */
        p1.name ="Sung jinwhoo";
        p1.age =27;
        p1.job = "Monarch of Shadows";
        /* System.out.println(p1.age);// 0 --> default , if and only if there is no value given to it
        System.out.println(p1.name);// null --> string
        System.out.println(p1.job);*/
        p1.printDetails();

        Person p2 = new Person();
        p2.name = "Suho Jinwhoo";
        p2.age = 15;
        p2.job = "Ragnarok";
        p2.printDetails();

    }
}
