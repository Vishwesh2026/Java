class Student{
    String name;
    int age;
    Student(String n, int a){
        name = n;
        age = a;
    }

public String toString() {
    return "["+ name +" ,"+ age + "]";
}
}
public class toStringMethod {
        public static void main(String[] args) {
            Student s = new Student("Sung",37);
            System.out.println(s);
            Student s1 = new Student("Suho",15);
            System.out.println(s1);
            
        }
}
