class ThisKeyWord {
    String name;
    int age;
    String campus;
    String branch;
    ThisKeyWord(String name){
        this.name = name;
        System.out.println(name + " is created");
    }
    ThisKeyWord(String name, int age){
        this(name);
        this.age = age;
        System.out.println(name + " " +age + " years old student is created");
    }
    ThisKeyWord(String name, int age, String campus) {
        this(name, age);
        this.campus = campus;
        System.out.println(name + " is a student of " + campus+" age of "+ age);
    }
    ThisKeyWord(String name,int age ,String campus, String branch){
        this(name, age, campus);
        System.out.println(name + " " + age +" studies in the branch of " +branch +" in " +campus );
    }
    public void display(){

        System.out.println("Name :"+name);
        System.out.println("Campus :" +age);
        System.out.println("Campus: " +campus);
        System.out.println("Branch :" +branch);
        System.out.println("\n");
    }
    
}
public class ThisKeyWord_1 {

    public static void main(String[] args) {
        ThisKeyWord t1 = new ThisKeyWord("John");
        ThisKeyWord t2 = new ThisKeyWord("Jane", 20);
        ThisKeyWord t3 = new ThisKeyWord("Tom", 25,"Campus A");
        ThisKeyWord t4 = new ThisKeyWord("Alice", 18, "Campus B","Computer Science");
        System.out.println("\n");
        t1.display();
        t2.display();
        t3.display();
        t4.display();
    }
}