class Function{

    int arg1, arg2;
    int arg3 = 10;
    
    Function(int arg1, int arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    void display(){
        System.out.println("Addition of arg1 and arg2 :" + (arg1 + arg2));
    }
}

class SubFunction extends Function {
    SubFunction(int arg1, int arg2) {
        super(arg1, arg2);
        System.out.println("subtraction of arg1  and arg2: " + (arg1-arg2));
    }
}
class SubFunction1 extends Function {
    SubFunction1(int arg1, int arg2) {
        super(arg1, arg2);
        System.out.println("subtraction of arg1  and arg2: " + (arg1-arg2));
    }
}

public class interation {
    public static void main(String[] args) {
        SubFunction f = new SubFunction(5, 3);
        f.display();
        System.out.println("Value of Arguments: " + f.arg1 + ", " + f.arg2);
    }
}
